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
        <title>Log Masuk</title>
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
                <p>/LogMasuk</p>
            </div>
            <div id="layoutAuthentication_content">
                <main>
                    <div class="container">
                        <div class="row justify-content-center">
                            <div class="col-lg-5">
                                <div class="card shadow-lg border-0 rounded-lg mt-5">
                                    <div class="card-header d-flex justify-content-center align-items-center">
                                        <img src="img/icon2.png" alt="Logo" height="100"/>
                                    </div>
                                    
                                    <div class="card-body">
                                        <form>
                                            <div class="form-selection form-floating">
                                                <select id="userType" name="userType">
                                                  <option selected disabled>Jenis Pengguna</option>
                                                  <option>MBIP</option>
                                                  <option>Peserta</option>
                                                </select>
                                              </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputUsername" type="text" placeholder="Nama Pengguna" />
                                                <label for="inputUsername">Nama Pengguna</label>
                                            </div>
                                            <div class="form-floating mb-3">
                                                <input class="form-control" id="inputPassword" type="password" placeholder="Kata Laluan" />
                                                <label for="inputPassword">Kata Laluan</label>
                                            </div>
                                            <div class="form-check mb-3">
                                                <input class="form-check-input" id="inputRememberPassword" type="checkbox" value="" />
                                                <label class="form-check-label" for="inputRememberPassword">Ingat Kata Laluan</label>
                                            </div>
                                            <div class="d-flex align-items-center justify-content-between mt-4 mb-0">
                                                <a class="btn btn-primary" href="home.jsp">Log Masuk</a>
                                            </div>
                                        </form>
                                    </div>
                                    <div class="card-footer text-center py-3">
                                        <div class="small"><a href="register.jsp">Perlukan Akaun? Daftar Di sini!</a></div>
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
