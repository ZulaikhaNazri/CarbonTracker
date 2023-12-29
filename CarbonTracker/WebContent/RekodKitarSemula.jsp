<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Rekod Penggunaan Bahan Kitar Semula</title>
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
            <li><a href=rekodBulanan.jsp>Rekod Bulanan</a></li> 
            <li>Rekod Penggunaan Bahan Kitar Semula</li>
          </ol>
        </div>
      </section>
      <!-- End Breadcrumbs -->
      
      <div class="formContainer">
        <h2>Rekod Penggunaan Bahan Kitar Semula</h2>
        
        <div class="electric-image">
        <img src="img\Kitar_Semula.png" alt="PanduanSemakanElektrik" class="panduan-image" />
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
            <br><br><br>
            <label for="jumlahterkumpulkg">Jumlah Terkumpul (KG):</label>
                <input type="text" name="jumlahterkumpulkg" placeholder="e.g.36.83kg" required>
            <br><br>
            <label for="jumlahterkumpulrm">Jumlah Terkumpul (RM):</label>
                <input type="text" name="jumlahterkumpulrm" placeholder="e.g.36.83kg" required>
            <br><br>
            <input type="submit" value="Kemas Kini">
            </form>
        </div>
      </div>
      
    </div>
  </div>
  </body>
</html>