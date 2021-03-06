function extractId(pattern, url) {
  var match = pattern.exec(url);
  return match ? match[1] : null;
}

function extractYoutubeId(url) {
  var pattern = /(?:http:\/\/)?(?:[a-z-]+[.])?youtube(?:[.][a-z-]+)+\/(?:watch[?].*v=|v[\/])([a-z0-9_-]+)/i;
  return extractId(pattern, url);
}

function extractGoogleVideoDocid(url) {
  var pattern = /(?:http:\/\/)?video[.]google(?:[.][a-z-]+)+\/videoplay[?]docid=(-?\d+)/i;
  return extractId(pattern, url);
}

function extractVimeoId(url) {
	var pattern = /(?:http:\/\/)?(?:www\.)?vimeo\.com\/(\d+)/i;
	return extractId(pattern, url);
}

function gcVideoMain(video_url, flashEmbedCallback, container) {
  if (video_url) {
    var id;
    if ((id = extractYoutubeId(video_url))) {
      // &rel=0 disables the mouseover for related videos.
      flashEmbedCallback("http://www.youtube.com/v/" + id + "&rel=0", "video", 8);
    } else if ((id = extractGoogleVideoDocid(video_url))) {
      flashEmbedCallback(
          "http://video.google.com/googleplayer.swf?docid=" + id + "&hl=en&fs=true",
          "video", 8);
    } else if ((id = extractVimeoId(video_url))) {
      flashEmbedCallback(
          "http://vimeo.com/moogaloop.swf?clip_id=" + id ,
          "video", 8);
    }else {
      // TODO: video_url should be HTML escaped.
      container.innerHTML = "<p>id: " + id + "</p>";
      container.innerHTML = "<p>Oops!  You asked us to play '<b>" + video_url + "</b>'.</p>";
      container.innerHTML += "<p>I do not know how to play this kind of video.</p>";
      container.innerHTML += "<p>Is it a Google Video or YouTube URL?</p>";
    }
  } else {
    container.innerHTML = "Oops!  You need to pass the URL to the video as the &up_video= parameter.";
  }
}