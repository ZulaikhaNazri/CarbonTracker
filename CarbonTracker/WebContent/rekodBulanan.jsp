<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rekod Penggunaan Elektrik</title>
<script src="https://kit.fontawesome.com/2012184ce7.js" crossorigin="anonymous"></script>
    <link href="css/style.css" rel="stylesheet" />
</head>
<body>

<div>
    <div class="home-container">
      <nav class="home-nav">
        <img src="img/logo_baru_web.gif" alt="image" class="home-image" />
        <span class="home-text">MAJLIS BANDARAYA ISKANDAR PUTERI</span>
        <a href="home.jsp" class="home-text02">Laman Utama</a>
        <a href="AnalisisKarbon.jsp" class="home-text03">Analisis Karbon</a>
        <a href="AnalisisKeseluruhan.jsp" class="home-text04">Analisis Karbon Keseluruhan</a>
        <a href="AnalisisAir.jsp" class="home-text05">Penggunaan Air</a>
        <a href="AnalisisElektrik.jsp" class="home-text06">Penggunaan Elektrik</a>
        <a href="AnalisisKitarSemula.jsp" class="home-text07">Kegunaan Bahan Kitar Semula</a>
        <a href="rekodBulanan.jsp" class="home-text08">Rekod Bulanan</a>
        <a href="RekodPenyertaan.jsp" class="home-text20">Rekod Penyertaan</a>
        <a href="Profile.jsp" class="home-text10">Profil</a>
      </nav>
      <!--<h1 class="home-text07">Laman Utama</h1>-->

      <!-- ======= Breadcrumbs ======= -->
      <section id="breadcrumbs" class="breadcrumbs">
        <div class="container">
          <br><br>
          <ol>
            <li><a href="home.jsp">Laman Utama</a></li>
            <li>Rekod Bulanan</li>
          </ol>
        </div>
      </section>
      <!-- End Breadcrumbs -->
      
      <div class="formContainer">
        <h2>REKOD BULANAN</h2>
        <div class="table-container">
          <table>
            <tr>
              <th>
                <a href="electricConsumption.jsp" class="optionContainer">
                  <div class="rb-icon">
                      <i class="fa-solid fa-tower-cell"></i>
                  </div>
                  <div class="rb-text">
                      <h3>Rekod Penggunaan Elektrik</h3>
                  </div>
                </a>
              </th>
              <th>
                <a href="waterConsumption.jsp" class="optionContainer">
                  <div class="rb-icon">
                      <i class="fa-solid fa-faucet-drip"></i>
                  </div>
                  <div class="rb-text">
                      <h3>Rekod Penggunaan Air</h3>
                  </div>
                </a>
              </th>
            </tr>
            <tr>
              <th colspan="2">
                <a href="RekodKitarSemula.jsp" class="optionContainer">
                  <div class="rb-icon">
                      <i class="fa-solid fa-recycle"></i>
                  </div>
                  <div class="rb-text">
                      <h3>Rekod Pengumpulan</h3>
                      <h3>Bahan Kitar Semula</h3>
                  </div>
                </a>
              </th>
            </tr>
          </table>
        </div>
      </div>
   
    </div>
  </div>
  </body>
</html>