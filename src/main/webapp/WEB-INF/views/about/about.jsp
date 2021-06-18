<%@include file="../dynamic/css.jspf"%>
<body>

<%@include file="../dynamic/navigationMenu.jspf"%>

<!-- ======= About Section ======= -->
<section id="about" class="about">
  <div class="container">

    <div class="section-title">
      <h2>About</h2>
      <p>Magnam dolores commodi suscipit. Necessitatibus eius consequatur ex aliquid fuga eum quidem. Sit sint consectetur velit. Quisquam quos quisquam cupiditate. Et nemo qui impedit suscipit alias ea. Quia fugiat sit in iste officiis commodi quidem hic quas.</p>
    </div>

    <div class="row">
      <div class="col-lg-4" data-aos="fade-right">
        <img src="../../../resources/img/profile-img.jpg" class="img-fluid" alt="">



      </div>
      <div class="col-lg-8 pt-4 pt-lg-0 content" data-aos="fade-left">
        <h3>UI/UX Designer &amp; Web Developer.</h3>
        <p class="fst-italic">
          Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore
          magna aliqua.
        </p>
        <div class="row">
          <div class="col-lg-6">

            <c:forEach items="${abouts}" var="title">
            <ul>


              <li><i class="bi bi-chevron-right"></i> <strong>Birthday:</strong> <span>${title.birthday}</span></li>
              <li><i class="bi bi-chevron-right"></i> <strong>Website:</strong> <span>${title.website}</span></li>
              <li><i class="bi bi-chevron-right"></i> <strong>Phone:</strong> <span>${title.phone}</span></li>
              <li><i class="bi bi-chevron-right"></i> <strong>City:</strong> <span>${title.city}</span></li>
            </ul>
          </div>
          <div class="col-lg-6">
            <ul>
              <li><i class="bi bi-chevron-right"></i> <strong>Age:</strong> <span>${title.age}</span></li>
              <li><i class="bi bi-chevron-right"></i> <strong>Degree:</strong> <span>${title.degree}</span></li>
              <li><i class="bi bi-chevron-right"></i> <strong>PhEmailone:</strong> <span>${title.email}</span></li>
              <li><i class="bi bi-chevron-right"></i> <strong>Freelance:</strong> <span>${title.freelancer}</span></li>
            </ul>
          </div>
        </div>

        <td><a href="#" role="button" class="btn btn-success btn-circle" data-toggle="modal" data-target="#umiejetnosci"><i class="fas
                                        fa-check"></i></a></td>

        <td><a href='<c:url value="/about_edit/${title.id}"/>'
               class="btn-right btn btn-primary" role="button">Edytuj</a>
        </td>



        <p>
<%--        <li><i class="bi bi-chevron-right"></i> <strong>o mnie:</strong> <span>${title.about}</span></li>--%>
        </p>
      </div>
    </div>
    </c:forEach>
  </div>
</section><!-- End About Section -->



</main><!-- End #main -->

<!-- ======= Footer ======= -->
<%@include file="../dynamic/footer.jspf"%>

<!-- Vendor JS Files -->
<%@include file="../dynamic/JavaScript.jspf"%>

<!-- Template Main JS File -->
<script src="../../../resources/js/main.js"></script>

</body>

</html>