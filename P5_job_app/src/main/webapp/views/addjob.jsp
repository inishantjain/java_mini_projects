<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
    <%@ page contentType="text/html;charset=UTF-8" language="java" %>
        <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
            <br%@ page isELIgnored="false" %>

                <!DOCTYPE html>
                <html lang="en">

                <head>
                    <meta charset="UTF-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Job Portal</title>
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
                        rel="stylesheet"
                        integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
                        crossorigin="anonymous">
                    <link rel="stylesheet" type="text/css" href="style.css">
                </head>

                <body>
                    <nav class="navbar navbar-expand-lg navbar-light bg-warning">
                        <div class="container">
                            <a class="navbar-brand" href="#">Job Portal Web App</a>
                            <button class="navbar-toggler" type="button" data-bs-toggle="collapse"
                                data-bs-target="#navbarNav" aria-controls="navbarNav" aria-expanded="false"
                                aria-label="Toggle navigation">
                                <span class="navbar-toggler-icon"></span>
                            </button>
                            <div class="collapse navbar-collapse" id="navbarNav">
                                <ul class="navbar-nav ms-auto">
                                    <li class="nav-item"><a class="nav-link" href="home">Home</a></li>
                                    <li class="nav-item"><a class="nav-link" href="viewalljobs">About</a></li>
                                    <li class="nav-item"><a class="nav-link" href="#">Contact</a>
                                    </li>
                                </ul>
                            </div>
                        </div>
                    </nav>

                    <div class="container mt-5">
                        <div class="row justify-content-center">
                            <div class="col-md-6">
                                <div class="card">
                                    <div class="card-body">
                                        <h2 class="text-center">Post a New Job</h2>
                                        <form:form action="handleForm" method="post" modelAttribute="jobPost">
                                            <div class="mb-3">
                                                <label for="postId" class="form-label">Post ID</label>
                                                <input type="text" class="form-control" id="postId" name="postId"
                                                    required>
                                            </div>

                                            <div class="mb-3">
                                                <label for="postProfile" class="form-label">Post Profile</label>
                                                <input type="text" class="form-control" id="postProfile"
                                                    name="postProfile" required>
                                            </div>

                                            <div class="mb-3">
                                                <label for="postDesc" class="form-label">Post Description</label>
                                                <textarea class="form-control" id="postDesc" name="postDesc" rows="3"
                                                    required></textarea>
                                            </div>

                                            <div class="mb-3">
                                                <label for="reqExperience" class="form-label">Required
                                                    Experience</label>
                                                <input type="number" class="form-control" id="reqExperience"
                                                    name="reqExperience" required>
                                            </div>

                                            <div class="mb-3">
                                                <h3 for="postTechStack" class="form-label">Tech Stack</h3>

                                                <label for="postTechStack">Choose Tech Stack</label>
                                                </br>

                                                <c:forEach var="techStack" items="${availableTechStacks}">
                                                    <input name="postTechStack" type="checkbox" value="${techStack}"
                                                        class="" />&nbsp;${techStack} &nbsp;
                                                </c:forEach>
                                            </div>

                                            <button type="submit" class="btn btn-primary w-100">Submit</button>
                                        </form:form>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>

                    <!-- Add the Bootstrap JS and Popper.js scripts -->
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"
                        integrity="sha384-C6RzsynM9kWDrMNeT87bh95OGNyZPhcTNXj1NW7RuBCsyN/o0jlpcV8Qyq46cDfL"
                        crossorigin="anonymous"></script>
                </body>

                </html>