<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<title>Carbon Tracker</title>
  <meta content="" name="description">
  <meta content="" name="keywords">
<link href="resources/assets/img/favicon.png" rel="icon">
<link href="resources/assets/img/apple-touch-icon.png" rel="apple-touch-icon">

<link href="https://fonts.gstatic.com" rel="preconnect">
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Nunito:300,300i,400,400i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="resources/assets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="resources/assets/vendor/bootstrap-icons/bootstrap-icons.css" rel="stylesheet">
  <link href="resources/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="resources/assets/vendor/quill/quill.snow.css" rel="stylesheet">
  <link href="resources/assets/vendor/quill/quill.bubble.css" rel="stylesheet">
  <link href="resources/assets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="resources/assets/vendor/simple-datatables/style.css" rel="stylesheet">
  <link href="resources/assets/css/style.css" rel="stylesheet">
  
    <style>
        table {
            border-collapse: collapse;
            background: white;
            color: black;
        }
         
        th,
        td {
            font-weight: bold;
        }
    </style>
    
</head>
<body>

  <!-- ======= Header ======= -->
  <header id="header" class="header fixed-top d-flex align-items-center">

    <div class="d-flex align-items-center justify-content-between">
      <a href="LamanUtama" class="logo d-flex align-items-center">
        <img src="resources/assets/img/logo.png" alt="">
        <span class="d-none d-lg-block">CarbonTracker</span>
      </a>
      <i class="bi bi-list toggle-sidebar-btn"></i>
    </div><!-- End Logo -->

   
    <nav class="header-nav ms-auto">
      <ul class="d-flex align-items-center">

        <li class="nav-item dropdown pe-3">

          <a class="nav-link nav-profile d-flex align-items-center pe-0" href="#" data-bs-toggle="dropdown">
            <img src="resources/assets/img/profile-img.jpg" alt="Profile" class="rounded-circle">
            <span class="d-none d-md-block dropdown-toggle ps-2">${loggedInUser.name}</span>
          </a><!-- End Profile Iamge Icon -->

          <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
            <li class="dropdown-header">
              <h6>${loggedInUser.name}</h6>
              <span>${loggedInUser.category}</span>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>
            
            <li>
              <a class="dropdown-item d-flex align-items-center" href="Profile">
                <i class="bi bi-person"></i>
                <span>Profile Saya</span>
              </a>
            </li>
            <li>
              <hr class="dropdown-divider">
            </li>

            <li>
              <a class="dropdown-item d-flex align-items-center" href="logout">
                <i class="bi bi-box-arrow-right"></i>
                <span>Log Keluar</span>
              </a>
            </li>

          </ul><!-- End Profile Dropdown Items -->
        </li><!-- End Profile Nav -->

      </ul>
    </nav><!-- End Icons Navigation -->

  </header><!-- End Header -->

  <!-- ======= Sidebar ======= -->
  <aside id="sidebar" class="sidebar">

    <ul class="sidebar-nav" id="sidebar-nav">

      <li class="nav-item">
        <a class="nav-link " href="LamanUtama">
          <i class="bi bi-grid"></i>
          <span>Laman Utama</span>
        </a>
      </li><!-- End Dashboard Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" data-bs-target="#components-nav" data-bs-toggle="collapse" href="#">
          <i class="bi bi-graph-up"></i><span>Analisis Karbon</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="components-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="BorangAir">
              <i class="bi bi-circle"></i><span>Penggunaan Air</span>
            </a>
          </li>
          <li>
            <a href="BorangElektrik">
              <i class="bi bi-circle"></i><span>Penggunaan Elektrik</span>
            </a>
          </li>
          <li>
            <a href="BorangKitarSemula">
              <i class="bi bi-circle"></i><span>Kegunaan Bahan Kitar Semula</span>
            </a>
          </li>
        </ul>
      </li><!-- End Components Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="RekodBulanan">
          <i class="bi bi-folder2"></i>
          <span>Rekod Bulanan</span>
        </a>
      </li><!-- End Profile Page Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="RekodPenyertaan">
          <i class="bi bi-calendar-month"></i>
          <span>Rekod Penyertaan</span>
        </a>
      </li><!-- End F.A.Q Page Nav -->

      <li class="nav-item">
        <a class="nav-link collapsed" href="Profile">
          <i class="bi bi-person"></i>
          <span>Profile</span>
        </a>
      </li><!-- End Contact Page Nav -->


    </ul>

  </aside><!-- End Sidebar-->

  <main id="main" class="main">

    <div class="pagetitle">
      <h1>Rekod Bulanan</h1>
      <nav>
        <ol class="breadcrumb">
          <li class="breadcrumb-item"><a href="LamanUtama">Laman Utama</a></li>
          <li class="breadcrumb-item active">Rekod Bulanan</li>
        </ol>
      </nav>
    </div><!-- End Page Title -->

    <section class="section dashboard">
      <div class="row">
      
    <body>
    <!-- Here we are using attributes like
        cellspacing and cellpadding -->
 
    <!-- The purpose of the cellpadding is 
        the space that a user want between
        the border of cell and its contents-->
 
    <!-- cellspacing is used to specify the 
        space between the cell and its contents -->
    <h2 align="center" style="color: blue;">
        January 2024
    </h2>
    <br />
 
    <table bgcolor="lightgrey" align="center"
        cellspacing="21" cellpadding="21">
 
        <!-- The tr tag is used to enter 
            rows in the table -->
 
        <!-- It is used to give the heading to the
            table. We can give the heading to the 
            top and bottom of the table -->
 
        <caption align="top">
            <!-- Here we have used the attribute 
                that is style and we have colored 
                the sentence to make it better 
                depending on the web page-->
        </caption>
 
        <!-- Here th stands for the heading of the
            table that comes in the first row-->
 
        <!-- The text in this table header tag will 
            appear as bold and is center aligned-->
 
        <thead>
            <tr>
                <!-- Here we have applied inline style 
                     to make it more attractive-->
                <th style="color: white; background: blue;">
                    Sun</th>
                <th style="color: white; background: blue;">
                    Mon</th>
                <th style="color: white; background: blue;">
                    Tue</th>
                <th style="color: white; background: blue;">
                    Wed</th>
                <th style="color: white; background: blue;">
                    Thu</th>
                <th style="color: white; background: blue;">
                    Fri</th>
                <th style="color: white; background: blue;">
                    Sat</th>
            </tr>
        </thead>
 
        <tbody>
            <tr>
               
                <td></td>
                <td>1</td>
                <td>2</td>
                <td>3</td>
                <td>4</td>
                <td>5</td>
                <td>6</td>
             <tr>
                <td>7</td>
                <td>8</td>
                <td>9</td>
                <td>10</td>
                <td>11</td>
                <td>12</td>
                <td>13</td>
            </tr>
            <tr>    
                <td>14</td>
                <td>15</td>
                <td>16</td>
                <td>17</td>
                <td>18</td>
                <td>19</td>
                <td>20</td>
            </tr>
            <tr>
                <td>21</td>
                <td>22</td>
                <td>23</td>
                <td>24</td>
                <td>25</td>
                <td>26</td>
                <td>27</td>
            </tr>
            <tr>
                <td>28</td>
                <td>29</td>
                <td>30</td>
                <td>31</td>
                
            </tr>
        </tbody>
    </table>
</body>  

       

      </div>
    </section>

  </main><!-- End #main -->

  <!-- ======= Footer ======= -->
  <footer id="footer" class="footer">
    <div class="copyright">
      &copy; Copyright <strong><span>NiceAdmin</span></strong>. All Rights Reserved
    </div>
    <div class="credits">
      <!-- All the links in the footer should remain intact. -->
      <!-- You can delete the links only if you purchased the pro version. -->
      <!-- Licensing information: https://bootstrapmade.com/license/ -->
      <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/ -->
      Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
    </div>
  </footer><!-- End Footer -->

  <a href="#" class="back-to-top d-flex align-items-center justify-content-center"><i class="bi bi-arrow-up-short"></i></a>

  <!-- Vendor JS Files -->
  <script src="resources/assets/vendor/apexcharts/apexcharts.min.js"></script>
  <script src="resources/assets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="resources/assets/vendor/chart.js/chart.umd.js"></script>
  <script src="resources/assets/vendor/echarts/echarts.min.js"></script>
  <script src="resources/assets/vendor/quill/quill.min.js"></script>
  <script src="resources/assets/vendor/simple-datatables/simple-datatables.js"></script>
  <script src="resources/assets/vendor/tinymce/tinymce.min.js"></script>
  <script src="resources/assets/vendor/php-email-form/validate.js"></script>

  <!-- Template Main JS File -->
  <script src="resources/assets/js/main.js"></script>

</body>
</html>