<map version="0.9.0">
<!-- To view this file, download free mind mapping software FreeMind from http://freemind.sourceforge.net -->
<node CREATED="1306973663678" ID="ID_477282581" MODIFIED="1306974394181" TEXT="Wind Bklog">
<font BOLD="true" NAME="SansSerif" SIZE="23"/>
<node CREATED="1306973714712" ID="ID_1258238573" MODIFIED="1306974340713" POSITION="right" TEXT="Faces">
<font BOLD="true" NAME="SansSerif" SIZE="17"/>
<node CREATED="1306974134385" ID="ID_1822911466" MODIFIED="1307055772822" TEXT="ComboBox">
<icon BUILTIN="full-3"/>
<node CREATED="1306974160433" ID="ID_1067140854" MODIFIED="1306974170512" TEXT="Estrategia de Carregamento"/>
<node CREATED="1306974171121" ID="ID_1946193836" MODIFIED="1306974184337" TEXT="Bind value ao selecionar obj no grid"/>
</node>
<node CREATED="1306974186721" ID="ID_1205687686" MODIFIED="1307055765638" TEXT="Mask">
<icon BUILTIN="full-2"/>
<node CREATED="1306974202157" ID="ID_861165799" MODIFIED="1307194853176" TEXT="Ajustar Lang">
<icon BUILTIN="button_ok"/>
</node>
<node CREATED="1306974212665" ID="ID_773249475" MODIFIED="1307194856199" TEXT="Test">
<icon BUILTIN="button_ok"/>
</node>
<node CREATED="1307063978998" ID="ID_1284318891" MODIFIED="1307064001121" TEXT="Documentar wildcards de mascara"/>
<node CREATED="1307194766424" ID="ID_727685824" MODIFIED="1307203604651" TEXT="Tipos de mascara built-in (currency, cpf, telefone, etc)">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Deve ser integrado com o Preferences.
    </p>
    <p>
      Preferences ir&#225; configurar o formato para&#160;&#160;os diferentes tipos de mascara built-in
    </p>
    <p>
      Al&#233;m disso o usu&#225;rio deve ser capaz de definir mascaras aplicaveis globalmente em seu app. Isso deve ser feito de forma a proporcionar a internacionalizacao, ou seja, deve ser possivel utilizar mascaras configuras em arquivos de mensagens (bundle properties)
    </p>
  </body>
</html>
</richcontent>
</node>
<node CREATED="1307199189478" ID="ID_1420195898" MODIFIED="1307204790852" TEXT="Obter valor de campo com mascara">
<icon BUILTIN="button_ok"/>
</node>
</node>
<node CREATED="1307061957485" ID="ID_1520458177" MODIFIED="1307062035243" TEXT="Misc">
<icon BUILTIN="idea"/>
<node CREATED="1307061966298" ID="ID_1045277104" MODIFIED="1307061984734" TEXT="Limpar area de edicao ap&#xf3;s executar operacao"/>
<node CREATED="1307061986069" ID="ID_71183347" MODIFIED="1307061993125" TEXT="Bloquear area de edicao ao executar op"/>
<node CREATED="1307061994293" ID="ID_412488940" MODIFIED="1307062001871" TEXT="Botao limpar edition view"/>
<node CREATED="1307062035861" ID="ID_994022818" MODIFIED="1307062060417" TEXT="Botoes limpar e exportar no Log View"/>
<node CREATED="1307062080317" ID="ID_1491367609" MODIFIED="1307062095077" TEXT="Executar operacao &quot;Abrir Filtrando&quot; como job"/>
</node>
<node CREATED="1307140513773" ID="ID_672705016" MODIFIED="1307140519317" TEXT="Folders and Groups"/>
<node CREATED="1307140521061" ID="ID_1371316085" MODIFIED="1307140523621" TEXT="Wizard"/>
<node CREATED="1307204974952" ID="ID_1464170620" MODIFIED="1307204979481" TEXT="Grid">
<node CREATED="1307204981440" ID="ID_1287652812" MODIFIED="1307205047386" TEXT="Value Hander pra Grid">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Utilizar mascara para formatar valor no grid
    </p>
    <p>
      Definir propriedades que farao parte da &quot;Chave Funcional&quot; do objeto. Atualmente temos o toString. AJustar esse nome e projetar uma solucao
    </p>
  </body>
</html>
</richcontent>
</node>
</node>
</node>
<node CREATED="1306973717939" ID="ID_1710355572" MODIFIED="1306974383721" POSITION="right" TEXT="Persistence">
<font BOLD="true" NAME="SansSerif" SIZE="17"/>
<node CREATED="1307057967308" ID="ID_1505096962" MODIFIED="1307057997103" TEXT="Transa&#xe7;&#xf5;es">
<icon BUILTIN="idea"/>
</node>
</node>
<node CREATED="1306973844465" ID="ID_1789316879" MODIFIED="1306974333105" POSITION="left" TEXT="Rules">
<font BOLD="true" NAME="SansSerif" SIZE="17"/>
<node CREATED="1306975239770" ID="ID_102071373" MODIFIED="1306975253717" TEXT="API">
<font BOLD="true" NAME="SansSerif" SIZE="15"/>
<node CREATED="1306975267114" ID="ID_1772893528" MODIFIED="1306976303278" TEXT="Criar select no ModelReference">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Na API Groovy, mover o metodo select do ExecutionContext para o ModelReference.
    </p>
    <p>
      Dessa forma esse metodo s&#243; faz selects de objetos do tipo ModelReference.
    </p>
    <p>
      Um outro metodo deve ser criado e associado ao ExecutionContext com proposito de executar selects diversos.
    </p>
  </body>
</html></richcontent>
<icon BUILTIN="button_ok"/>
</node>
<node CREATED="1306976243042" ID="ID_69842408" MODIFIED="1306976344878" TEXT="Criar select no ExecutionContext">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Um metodo deve ser criado e associado ao ExecutionContext com proposito de executar selects diversos.
    </p>
  </body>
</html></richcontent>
<icon BUILTIN="idea"/>
</node>
<node CREATED="1306975021233" ID="ID_1140781128" MODIFIED="1307057987479" TEXT="set ref para domain object no resultado do filtro">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Colocar no PersistenceAPI
    </p>
  </body>
</html></richcontent>
<icon BUILTIN="button_ok"/>
</node>
<node CREATED="1307140497589" ID="ID_1787730477" MODIFIED="1307140500422" TEXT="Design"/>
</node>
<node CREATED="1307140479053" ID="ID_1441685963" MODIFIED="1307140487272" TEXT="Unit Tests"/>
<node CREATED="1307140506109" ID="ID_1314154517" MODIFIED="1307140508704" TEXT="BPM"/>
</node>
<node CREATED="1306973870009" ID="ID_796326644" MODIFIED="1306974415134" POSITION="left" TEXT="Lang">
<font BOLD="true" NAME="SansSerif" SIZE="17"/>
<node CREATED="1306974230014" ID="ID_1481146059" MODIFIED="1307055778542" TEXT="Adicionar niveis de visibilidade">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Edition
    </p>
    <p>
      Grid
    </p>
    <p>
      None
    </p>
    <p>
      
    </p>
    <p>
      Possibilitar indicar mais de um valor separados por virgula (,)
    </p>
  </body>
</html></richcontent>
<icon BUILTIN="full-4"/>
</node>
<node CREATED="1306974417817" ID="ID_1305493283" MODIFIED="1307055780854" TEXT="Propriedade Value">
<richcontent TYPE="NOTE"><html>
  <head>
    
  </head>
  <body>
    <p>
      Adicionar suporte a propriedade &quot;value&quot; para atributos.
    </p>
    <p>
      Deve aceitar EL
    </p>
  </body>
</html></richcontent>
<icon BUILTIN="full-5"/>
</node>
</node>
<node CREATED="1306975003266" ID="ID_1465916243" MODIFIED="1307140409765" POSITION="right" TEXT="Controller">
<font BOLD="true" NAME="SansSerif" SIZE="17"/>
</node>
<node CREATED="1307058052396" ID="ID_632189202" MODIFIED="1307058063004" POSITION="left" TEXT="DOC">
<font BOLD="true" NAME="SansSerif" SIZE="17"/>
<node CREATED="1307058066556" ID="ID_1620333194" MODIFIED="1307058086620" TEXT="Documentar Storage System (Blog It)"/>
</node>
<node CREATED="1307140351985" ID="ID_1077183780" MODIFIED="1307140415693" POSITION="right" TEXT="Controle de Acesso">
<font BOLD="true" NAME="SansSerif" SIZE="17"/>
</node>
</node>
</map>
