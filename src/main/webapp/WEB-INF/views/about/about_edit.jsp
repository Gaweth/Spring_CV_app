<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="../dynamic/css.jspf"%>
<body>

<%@include file="../dynamic/navigationMenu.jspf"%>

    <!-- ======= About Section ======= -->
    <section id="about" class="about">
      <div class="container">

        <form method="post" action='<c:url value="/about/${about.id}"/>'>

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



            <div class ="form-group row">
              <label class="col-2 col-form-label"> o mnie</label>
              <textarea class ="form-control" name="start"
                        rows="5"></textarea>

            </div>


            <div class="row">
              <div class="col-lg-6">
                <ul>
               <li><i class="bi bi-chevron-right"></i> <strong>Birthday:</strong> <textarea>${about.birthday}</textarea></li>

<%--                  <div class="form-group row">--%>
<%--                    <label class="col-2 col-form-label">Birthday</label>--%>
<%--                    <div class="col-10">--%>
<%--                      <input class="form-control" type="date" name="birthday"--%>
<%--                             value="${about.birthday}">--%>
<%--                    </div>--%>

                  <li><i class="bi bi-chevron-right"></i> <strong>Website:</strong>  <textarea>${about.website}</textarea></li>

                  <li><i class="bi bi-chevron-right"></i> <strong>Phone:</strong> <textarea>${about.phone}</textarea></li>
                  <li><i class="bi bi-chevron-right"></i> <strong>City:</strong> <textarea>New York, USA</textarea></li>
                </ul>
              </div>
              <div class="col-lg-6">
                <ul>
                  <li><i class="bi bi-chevron-right"></i> <strong>Age:</strong> <textarea>${about.age}</textarea></li>
                  <li><i class="bi bi-chevron-right"></i> <strong>Degree:</strong> <textarea>${about.degree}</textarea></li>
                  <li><i class="bi bi-chevron-right"></i> <strong>PhEmailone:</strong> <textarea>${about.email}</textarea></li>
                  <li><i class="bi bi-chevron-right"></i> <strong>Freelance:</strong> <textarea>${about.freelancer}</textarea></li>
                </ul>
              </div>
            </div>
            <p>
              <textarea> Officiis eligendi itaque labore et dolorum mollitia officiis optio vero. Quisquam sunt adipisci omnis et ut. Nulla accusantium dolor incidunt officia tempore. Et eius omnis.
              Cupiditate ut dicta maxime officiis quidem quia. Sed et consectetur qui quia repellendus itaque neque. Aliquid amet quidem ut quaerat cupiditate. Ab et eum qui repellendus omnis culpa magni laudantium dolores.
            </textarea>

            </p>
          </div>
        </div>




        </form>



                      <!-- Modal footer -->
                      <div class="modal-footer">
                          <input class="btn btn-success pull-left" type="submit" value="Zapisz zmiany" id="searchButton"></input>
                          <form name="post" method="post" action='<c:url
                                    value="/about_edit/${about.id}"/>'>
                          </form>
                      </div>

                  </div>

              </div>
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