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

        <form method="post" action='<c:url value="/about_edit/${about.id}"/>'>

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




<%--                                    <li><i class="bi bi-chevron-right"></i> <strong>birthday:</strong>  <textarea>${about.birthday}</textarea></li>--%>


                                    <%--                  <div class="form-group row">--%>
                                    <%--                    <label class="col-2 col-form-label">Birthday</label>--%>
                                    <%--                    <div class="col-10">--%>
                                    <%--                      <input class="form-control" type="date" name="birthday"--%>
                                    <%--                             value="${about.birthday}">--%>
                                    <%--                    </div>--%>

                                    <%--                  <li><i class="bi bi-chevron-right"></i> <strong>Website:</strong>  <textarea>${about.website}</textarea></li>--%>


                                <p><span class=" title-s">birthday: </span> <span><input class="form-control"
                                                                                        type="text"
                                                                                        name="birthday"
                                                                                        value="${about.birthday}"></span>

                                <p><span class=" title-s">website: </span> <span><input class="form-control"
                                                                                        type="text"
                                                                                        name="website"
                                                                                        value="${about.website}"></span>


                                <p><span class=" title-s">Phone: </span> <span><input class="form-control"
                                                                                      type="text"
                                                                                      name="phone"
                                                                                      value="${about.phone}"></span>

                                <p><span class=" title-s">City: </span> <span><input class="form-control"
                                                                                      type="text"
                                                                                      name="city"
                                                                                      value="${about.city}"></span>
                            </ul>
                        </div>
                        <div class="col-lg-6">
                            <ul>
                                <p><span class=" title-s">age: </span> <span><input class="form-control"
                                                                                    type="text"
                                                                                    name="age"
                                                                                    value="${about.age}"></span>

                                <p><span class=" title-s">degree: </span> <span><input class="form-control"
                                                                                       type="text"
                                                                                       name="degree"
                                                                                       value="${about.degree}"></span>

                                <p><span class=" title-s">email: </span> <span><input class="form-control"
                                                                                      type="text"
                                                                                      name="email"
                                                                                      value="${about.email}"></span>

                                <p><span class=" title-s">freelancer: </span> <span><input class="form-control"
                                                                                           type="text"
                                                                                           name="freelancer"
                                                                                           value="${about.freelancer}"></span>

<%--                                <p><span class=" title-s">about: </span> <span><input class="form-control"--%>
<%--                                                                                      type="text"--%>
<%--                                                                                      name="about"--%>
<%--                                                                                      value="${about.about}"></span>--%>

                            </ul>
                        </div>
                    </div>
                    <p>


                    </p>
                </div>
            </div>


            <input class="btn btn-dark pull-left" type="submit" value="Save"
                   id="searchButton"></input>

        </form>



        <!-- Modal footer -->
        <div class="modal-footer">


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