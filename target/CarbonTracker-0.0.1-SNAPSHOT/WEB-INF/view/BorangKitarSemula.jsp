@ -45,13 +45,13 @@

          <a class="nav-link nav-profile d-flex align-items-center pe-0" href="#" data-bs-toggle="dropdown">
            <img src="resources/assets/img/profile-img.jpg" alt="Profile" class="rounded-circle">
            <span class="d-none d-md-block dropdown-toggle ps-2">Zulaikha Nazri</span>
            <span class="d-none d-md-block dropdown-toggle ps-2">${loggedInUser.name}</span>
          </a><!-- End Profile Iamge Icon -->

          <ul class="dropdown-menu dropdown-menu-end dropdown-menu-arrow profile">
            <li class="dropdown-header">
              <h6>Zulaikha Nazri</h6>
              <span>Web Designer</span>
              <h6>${loggedInUser.name}</h6>
              <span>${loggedInUser.category}</span>
            </li>
            <li>
              <hr class="dropdown-divider">
@ -60,7 +60,7 @@
            <li>
              <a class="dropdown-item d-flex align-items-center" href="Profile">
                <i class="bi bi-person"></i>
                <span>My Profile</span>
                <span>Profile Saya</span>
              </a>
            </li>
            <li>
@ -68,9 +68,9 @@
            </li>

            <li>
              <a class="dropdown-item d-flex align-items-center" href="#">
              <a class="dropdown-item d-flex align-items-center" href="logout">
                <i class="bi bi-box-arrow-right"></i>
                <span>Sign Out</span>
                <span>Log Keluar</span>
              </a>
            </li>

@ -99,11 +99,6 @@
          <i class="bi bi-graph-up"></i><span>Analisis Karbon</span><i class="bi bi-chevron-down ms-auto"></i>
        </a>
        <ul id="components-nav" class="nav-content collapse " data-bs-parent="#sidebar-nav">
          <li>
            <a href="components-alerts.html">
              <i class="bi bi-circle"></i><span>Analisis Karbon Keseluruhan</span>
            </a>
          </li>
          <li>
            <a href="BorangAir">
              <i class="bi bi-circle"></i><span>Penggunaan Air</span>
