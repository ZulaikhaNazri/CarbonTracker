<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Analisis Karbon</title>
    <link href="css/style.css" rel="stylesheet" />
    <link href="https://maxcdn.bootstrapcdn.com/font-awesome/4.3.0/css/font-awesome.min.css" rel="stylesheet">
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
            <li>Profil</li>
          </ol>
        </div>
      </section>
      <!-- End Breadcrumbs -->
      
      <div class="container bootstrap snippets bootdeys">
        <div class="row">
          <div class="col-xs-12 col-sm-9">
            <form class="form-horizontal">
                <div class="panel panel-default">
                  <div class="panel-body text-center">
                   <img src="https://bootdey.com/img/Content/avatar/avatar6.png" class="img-circle profile-avatar" alt="User avatar">
                  </div>
                </div>
              <div class="panel panel-default">
                <div class="panel-heading">
                <h4 class="panel-title">Informasi Pengguna</h4>
                </div>
                <div class="panel-body">
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Nama</label>
                    <div class="col-sm-10">
                      <input type="text" class="form-control">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Passport/IC</label>
                    <div class="col-sm-10">
                      <input type="text" class="form-control">
                    </div>
                  </div>
                </div>
              </div>
        
              <div class="panel panel-default">
                <div class="panel-body">
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Alamat</label>
                    <div class="col-sm-10">
                      <textarea rows="3" class="form-control"></textarea>
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Nombor Telefon</label>
                    <div class="col-sm-10">
                      <input type="text" class="form-control">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Alamat Email</label>
                    <div class="col-sm-10">
                      <input type="email" class="form-control">
                    </div>
                  </div>
        	  </div>
              <div class="panel panel-default">
                <div class="form-group">
                  <label class="col-sm-2 control-label">Kategori</label>
                  <div class="col-sm-10">
                    <select class="form-control">
                      <option selected disabled>Kategori</option>
                      <option>A1: Perumahan Bertingkat di MBIP</option>
                      <option>A2: Perumahan Bertanah di MBIP</option>
                      <option>B1: Institusi di MBIP (<2000 populasi)</option>
                      <option>B2: Institusi di MBIP (>2000 populasi)</option>
                      <option>Lain-lain</option>
                    </select>
                  </div>
                </div>
                <div class="panel-body">
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Kata Laluan Sekarang</label>
                    <div class="col-sm-10">
                      <input type="password" class="form-control">
                    </div>
                  </div>
                  <div class="form-group">
                    <label class="col-sm-2 control-label">Kata Laluan Baharu</label>
                    <div class="col-sm-10">
                      <input type="password" class="form-control">
                    </div>
                  </div>
                </div>
                  <div class="form-group">
                    <div class="col-sm-10 col-sm-offset-2">
                      <button type="submit" class="btn btn-primary">Submit</button>
                      <button type="reset" class="btn btn-default">Cancel</button>
                    </div>
                  </div>
                </div>
              </div>
            </form>
          </div>
        </div>
        </div>
      
    </div>
  </div>
  </body>
</html>