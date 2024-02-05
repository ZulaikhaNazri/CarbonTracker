<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<meta content="width=device-width, initial-scale=1.0" name="viewport">
<title>Carbon Tracker - Daftar Akaun</title>
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
</head>
<body>

  <main>
    <div class="container">

      <section class="section register min-vh-100 d-flex flex-column align-items-center justify-content-center py-4">
        <div class="container">
          <div class="row justify-content-center">
            <div class="col-lg-4 col-md-6 d-flex flex-column align-items-center justify-content-center">

              <div class="d-flex justify-content-center py-4">
                <a href="/CarbonTracker/" class="logo d-flex align-items-center w-auto">
                  <img src="resources/assets/img/logo.png" alt="">
                  <span class="d-none d-lg-block">CarbonTracker</span>
                </a>
              </div><!-- End Logo -->

              <div class="card mb-3">

                <div class="card-body">

                  <div class="pt-4 pb-2">
                    <h5 class="card-title text-center pb-0 fs-4">Daftar Akaun</h5>
                    <p class="text-center small">Sila masukkan maklumat peribadi anda untuk mendaftar</p>
                  </div>

                  <form class="row g-3 needs-validation" novalidate method="POST" action="/CarbonTracker/SubmitRegistration">
                    <div class="col-12">
                      <label for="yourName" class="form-label">Nama Penuh</label>
                      <input type="text" name="name" class="form-control" id="name" required>
                      <div class="invalid-feedback">Sila masukkan nama anda!</div>
                    </div>
                    
                    <div class="col-12">
                      <label for="yourAddress" class="form-label">Alamat</label>
                      <input type="text" name="address" class="form-control" id="address" required>
                      <div class="invalid-feedback">Sila masukkan alamat anda!</div>
                    </div>

                    <div class="col-12">
                      <label for="yourEmail" class="form-label">Email</label>
                      <input type="email" name="email" class="form-control" id="email" required>
                      <div class="invalid-feedback">Sila masukkan email anda!</div>
                    </div>
                    
                    <div class="col-12">
                      <label for="Category" class="form-label">Kategori</label>
	                  <select class="form-select" name="category" id="category" required>
	                    <option selected disabled value="">Pilih...</option>
	                    <option>A1: Perumahan Bertingkat di MBIP</option>
	                    <option>A2: Perumahan Bertanah di MBIP</option>
	                    <option>B1: Institusi di MBIP(&lt;2000 populasi)</option>
	                    <option>B2: Institusi di MBIP(>2000 populasi)</option>
	                    <option>Lain-lain</option>
	                  </select>
	                  <div class="invalid-feedback">Sila pilih kategori anda!</div>
		             </div>

                    <div class="col-12">
                      <label for="username" class="form-label">Nama Pengguna</label>
                      <div class="input-group has-validation">
                        <span class="input-group-text" id="inputGroupPrepend">@</span>
                        <input type="text" name="username" class="form-control" id="username" required>
                        <div class="invalid-feedback">Sila pilih nama pengguna!</div>
                      </div>
                    </div>

                    <div class="col-12">
                      <label for="yourPassword" class="form-label">Kata Laluan</label>
                      <input type="password" name="password" class="form-control" id="password" required>
                      <div class="invalid-feedback">Sila masukkan kata laluan anda!</div>
                    </div>
                    
                    <div class="col-12">
                      <div class="form-check">
                        <input class="form-check-input" name="terms" type="checkbox" value="" id="acceptTerms" required>
                        <label class="form-check-label" for="acceptTerms">Saya bersetuju dan menerima <a href="#">terma dan syarat</a></label>
                        <div class="invalid-feedback">Anda perlu bersetuju sebelum mendaftar akaun.</div>
                      </div>
                    </div>

                    <div class="col-12">
                      <button class="btn btn-primary w-100" type="submit">Daftar Akaun</button>
                    </div>
                    <div class="col-12">
                      <p class="small mb-0">Sudah mendaftar akaun? <a href="/CarbonTracker/">Log Masuk</a></p>
                    </div>
                  </form>

                </div>
              </div>

              <div class="credits">
                <!-- All the links in the footer should remain intact. -->
                <!-- You can delete the links only if you purchased the pro version. -->
                <!-- Licensing information: https://bootstrapmade.com/license/ -->
                <!-- Purchase the pro version with working PHP/AJAX contact form: https://bootstrapmade.com/nice-admin-bootstrap-admin-html-template/ -->
                Designed by <a href="https://bootstrapmade.com/">BootstrapMade</a>
              </div>

            </div>
          </div>
        </div>

      </section>

    </div>
  </main><!-- End #main -->

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
  
  <!-- Function JS Files -->
  <script src="resources/assets/js/popup.js"></script>

  <!-- Template Main JS File -->
  <script src="resources/assets/js/main.js"></script>
  
  <script>
        // Check if success or error messages exist and display corresponding popups
        var successMessage = "${message}";
        var errorMessage = "${error}";

        if (successMessage) {
            showSuccessPopup(successMessage);
        }

        if (errorMessage) {
            showErrorPopup(errorMessage);
        }
    </script>

</body>
</html>