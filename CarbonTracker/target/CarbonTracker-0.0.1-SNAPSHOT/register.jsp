<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="utf-8" />
        <meta http-equiv="X-UA-Compatible" content="IE=edge" />
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no" />
        <meta name="description" content="" />
        <meta name="author" content="" />
        <title>Daftar Masuk</title>
        <link href="css/bootstrap-styles.css" rel="stylesheet" />
        <script src="https://use.fontawesome.com/releases/v6.3.0/js/all.js" crossorigin="anonymous"></script>
    </head>
    <body class="bg-primary">
        <div id="layoutAuthentication">
            <div class="top-panel bg-dark text-white p-2 d-flex align-items-center">
                <div>
                    <img src="img/logo_baru_web.gif" alt="Logo" height="60" style="padding-left: 1rem;" />
                </div>
                <div class="ms-2">
                    <span style="display: block; margin-bottom: -0.5rem;">MAJLIS</span>
                    <span style="display: block; margin-bottom: -0.5rem;">BANDARAYA</span>
                    <span style="display: block;">ISKANDAR PUTERI</span>
                </div>
                <div class="ms-auto">
                    <span><!-- Laman Utama --></span>
                </div>
            </div>
            <div class="second-panel p-2">
                <p>/DaftarAkaun</p>
            </div>
            <div id="layoutAuthentication_content">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-7">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header"><h3 class="text-center font-weight-light my-4">Daftar Akaun</h3></div>
                                    <div class="card-body">
                                        <form>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputName" type="text" placeholder="Nama" title="eg: Ali bin Abu" />
                                                <label for="inputName">Nama</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputEmail" type="email" placeholder="name@example.com" title="eg: name@example.com" />
                                                <label for="inputEmail">Email address</label>
                                            </div>
                                            <div class="row mb-3">
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputPassword" type="password" placeholder="Create a password" />
                                                        <label for="inputPassword">Kata Laluan</label>
                                                    </div>
                                                </div>
                                                <div class="col-md-6">
                                                    <div class="form-floating mb-3 mb-md-0">
                                                        <input class="form-control" id="inputPasswordConfirm" type="password" placeholder="Confirm password" />
                                                        <label for="inputPasswordConfirm">Sahkan Kata Laluan</label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputAlamat" type="text" placeholder="Alamat" title="eg: Alamat & Poskod" />
                                                <label for="inputName">Alamat</label>
                                            </div>
                                            <div class="form-selection form-floating">
                                                <select id="Kategori" name="Kategori">
                                                  <option selected disabled>Kategori</option>
                                                  <option>A1: Perumahan Bertingkat di MBIP</option>
                                                  <option>A2: Perumahan Bertanah di MBIP</option>
                                                  <option>B1: Institusi di MBIP (<2000 populasi)</option>
                                                  <option>B2: Institusi di MBIP (>2000 populasi)</option>
                                                  <option>Lain-lain</option>
                                                </select>
                                              </div>
                                            
                                            <div class="mt-4 mb-0">
                                                <div class="d-grid"><a class="btn btn-primary btn-block" onclick="showPopup()">Daftar Akaun</a></div>
                                            </div>
                                        </form>
                                    </div>
                                    <div class="card-footer text-center py-3">
                                        <div class="small"><a href="login.jsp">Sudah Daftar Akaun? Pergi ke Log Masuk</a></div>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </main>
            </div>
            <div id="layoutAuthentication_footer">
                <footer class="py-4 bg-light mt-auto">
                    <div class="container-fluid px-4">
                        <div class="d-flex align-items-center justify-content-between small">
                            <div class="text-muted">Copyright &copy; Your Website 2023</div>
                            <div>
                                <a href="#">Privacy Policy</a>
                                &middot;
                                <a href="#">Terms &amp; Conditions</a>
                            </div>
                        </div>
                    </div>
                </footer>
            </div>
        </div>
        <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.3/dist/js/bootstrap.bundle.min.js" crossorigin="anonymous"></script>
        <script src="js/scripts.js"></script>
    </body>
</html>
