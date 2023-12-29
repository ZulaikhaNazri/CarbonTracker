<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rekod Penggunaan Elektrik</title>
    <link href="css/style.css" rel="stylesheet" />
</head>
<body>

<div>
    <div class="home-container">
      <nav class="home-nav">
        <img src="img/logo_baru_web.gif" alt="image" class="home-image" />
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
            <li><a href=rekodBulanan.jsp>Rekod Bulanan</a></li>
            <li>Rekod Penggunaan Elektrik</li>
          </ol>
        </div>
      </section>
      <!-- End Breadcrumbs -->
      
      <div class="formContainer">
        <h2>Rekod Penggunaan Elektrik</h2>
        
        <div class="electric-image">
        <img src="img/Panduan_Semakan_Bil_Elektrik.png" alt="PanduanSemakanElektrik" class="panduan-image" />
        </div>

        <div class="electric-text">
            <form name="waterConsumptionForm" method="post" action="">
            <label for="bulan">Bulan:</label>
            <select id="course" name="course">
                <option value="null">Bulan</option>
                <option value="Januari">Januari</option>
                <option value="Februari">Februari</option>
                <option value="Mac">Mac</option>
                <option value="April">April</option>
                <option value="Mei">Mei</option>
                <option value="Jun">Jun</option>
                <option value="Julai">Julai</option>
                <option value="Ogos">Ogos</option>
                <option value="September">September</option>
                <option value="Oktober">Oktober</option>
                <option value="November">November</option>
                <option value="Disember">Disember</option>
            </select>
            <br><br>

            <label for="hariSemasa">Jumlah Hari Semasa:</label>
            <select id="course" name="hariSemasa" required>
              <option value="null">Hari</option>
              <option value="28">28</option>
              <option value="28">29</option>
              <option value="28">30</option>
              <option value="28">31</option>
            </select>
            <br><br>
            
            <label for="faktorProrata">Faktor Prorata:</label>
                <input type="number" name="faktorProrata" placeholder="e.g. 1.00000" required>
            <br><br>
            <label for="penggunaanm3">Penggunaan (kWh):</label>
                <input type="number" name="penggunaankWh" placeholder="e.g. 186" required>
            <br><br>
            <label for="penggunaanRm">Penggunaan (RM):</label>
                <input type="text" name="penggunaanm3" placeholder="e.g. 36.83" required>
            <br><br>
            <label for="bilSemasa">Bil Semasa:</label>
                <input type="image">
            <br><br>
            <input type="submit" value="Kemas Kini">
            </form>
        </div>
      </div>
      
    </div>
  </div>
  </body>
</html>