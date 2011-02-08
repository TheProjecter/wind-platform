/**
 * Unit tests for video.js.
 *
 * To run: rhino video_tests.js
 */
function assertContains(needle, haystack) {
  if (typeof needle != "string") {
    print("FAIL: needle argument must be a string.");
  } else if (typeof haystack != "string") {
    print("FAIL: haystack argument must be a string.");
  } else if (haystack.indexOf(needle) != -1) {
    print("PASS");
  } else {
    print("FAIL: '" + needle + "' not found in '" + haystack + "'");
  }
}

function assertNull(actual) {
  if (null == actual) {
    print("PASS");
  } else {
    print("FAIL: null expected, but received a" + typeof actual);
  }
}

function assertEquals(expected, actual) {
  if (typeof expected != "string") {
    print("FAIL: 'expected' argument must be a string.");
  } else if (typeof actual != "string") {
    print("FAIL: 'actual' argument must be a string, not " + typeof actual);
  } else if (expected == actual) {
    print("PASS");
  } else {
    print("FAIL: expected '" + expected + "', got '" + actual + "'");
  }
}

function YoutubeTests() {
  assertEquals("sNO2FkOTkbw",
               extractYoutubeId(" http://uk.youtube.com/watch?v=sNO2FkOTkbw&feature=rec-HM-rn"));
  assertEquals("sNO2FkOTkbw",
               extractYoutubeId("http://uk.youtube.com/watch?v=sNO2FkOTkbw&feature=rec-HM-rn"));
  assertEquals("sNO2FkOTkbw",
               extractYoutubeId("http://uk.youtube.com/watch?v=sNO2FkOTkbw&feature=rec-HM-rn&rel=0"));
  assertEquals("sNO2FkOTkbw",
               extractYoutubeId("http://uk.youtube.com/watch?v=sNO2FkOTkbw"));
  assertEquals("sNO2FkOTkbw",
               extractYoutubeId("http://www.youtube.com/watch?v=sNO2FkOTkbw&feature=rec-HM-rn"));
  assertEquals("sNO2FkOTkbw",
               extractYoutubeId("youtube.com/watch?v=sNO2FkOTkbw&feature=rec-HM-rn"));
  assertEquals("sNO2FkOTkbw",
               extractYoutubeId("youtube.com/watch?v=sNO2FkOTkbw"));
  assertEquals("sNO2FkOTkbw",
               extractYoutubeId("youtube.com/v/sNO2FkOTkbw"));
  assertEquals("sNO2FkOTkbw",
               extractYoutubeId(" youtube.com/v/sNO2FkOTkbw&rel=0"));
  assertEquals("7IRo-Ydyy84",
               extractYoutubeId("http://uk.youtube.com/watch?v=7IRo-Ydyy84"));
  assertNull(extractYoutubeId("http://uk.youtube.com/members"));
}

function GoogleVideoTests() {
  assertEquals("2538831956647446078",
               extractGoogleVideoDocid("http://video.google.com/videoplay?docid=2538831956647446078&hl=en"));
  assertEquals("2538831956647446078",
               extractGoogleVideoDocid("http://video.google.co.uk/videoplay?docid=2538831956647446078&hl=en"));
  assertEquals("2538831956647446078",
               extractGoogleVideoDocid("http://video.google.com/videoplay?docid=2538831956647446078"));
  assertEquals("2538831956647446078",
               extractGoogleVideoDocid("video.google.com/videoplay?docid=2538831956647446078&hl=en"));
  assertEquals("2538831956647446078",
               extractGoogleVideoDocid("video.google.com/videoplay?docid=2538831956647446078"));
  assertEquals("-3035093035748181693",
               extractGoogleVideoDocid("http://video.google.com/videoplay?docid=-3035093035748181693&hl=en#"));
  assertNull(extractGoogleVideoDocid("http://www.google.com/search?q=ocelots"));
}

function contains(needle) {
  return function (response) {
    assertContains(needle, response);
  }
}

function MainTest() {
  // Flash support is injected to the methods; we pass a method that verifies
  // that the proper video provider was chosen.
  gcVideoMain("http://video.google.com/videoplay?docid=2538831956647446078&hl=en",
              contains("video.google.com"));
  gcVideoMain("http://uk.youtube.com/watch?v=DhRU68v-ESg",
              contains("youtube.com"));
  gcVideoMain("http://uk.youtube.com/watch?v=DhRU68v-ESg&rel=0",
              contains("youtube.com/v/DhRU68v-ESg&rel=0"));
  gcVideoMain("http://uk.youtube.com/watch?v=DhRU68v-ESg&rel=0",
              contains("youtube.com/v/DhRU68v-ESg&rel=0"));

  // TODO: implement support for other video providers
  var container = {};
  gcVideoMain("http://www.vimeo.com/2512858",
              function() {}, container);
  assertContains("Oops", container.innerHTML);
}

load("video.js");

YoutubeTests();
GoogleVideoTests();
MainTest();
