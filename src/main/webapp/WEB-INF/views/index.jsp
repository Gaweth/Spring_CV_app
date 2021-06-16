<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<jsp:useBean id="now" class="java.util.Date"/>
<%@ page contentType="text/html; charset=UTF-8" %>
<%@include file="dynamic/css.jspf"%>

<body>

<!-- ======= Hero Section ======= -->
<section id="hero" class="d-flex flex-column justify-content-center align-items-center">
  <div class="hero-container" data-aos="fade-in">
    <h1>Jakub Magdon</h1>
    <p>I'm <span class="typed" data-typed-items="Designer, Developer, Freelancer, Photographer"></span></p>
  </div>
</section><!-- End Hero -->

<%@include file="dynamic/navigationMenu.jspf"%>

   
  </main><!-- End #main -->

  <%@include file="dynamic/footer.jspf"%>
  <!-- Vendor JS Files -->

  <%@include file="dynamic/JavaScript.jspf"%>


  <!-- Template Main JS File -->
  <script src="../../resources/js/main.js"></script>

</body>

</html>