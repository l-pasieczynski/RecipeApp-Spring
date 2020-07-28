<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="parts/header.jsp"%>

<body>

<section class="dashboard-section">
    <div class="container pt-4 pb-4">
        <div class="border-dashed view-height">
            <div class="container w-25">
                <form:form  method="post" modelAttribute="user" >
                    <h1 class="text-color-darker">Rejestracja</h1>
                    <div class="form-group">
                        <form:input type="text" class="form-control" id="name" path="username" name="name" placeholder="podaj imię"/>
                    </div>
                    <div class="form-group">
                        <form:input type="text" class="form-control" id="email" path="email" placeholder="podaj email"/>
                    </div>
                    <div class="form-group">
                        <form:input type="password" class="form-control" id="password" path="password" placeholder="podaj hasło"/>
                    </div>

                    <button class="btn btn-color rounded-4" type="submit">Zarejestruj</button>
                </form:form>
            </div>
        </div>
    </div>
</section>

</body>

<%@ include file="parts/footer.jsp"%>


