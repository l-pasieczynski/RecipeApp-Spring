<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ include file="parts/header.jsp"%>

<body>

<section>
    <div class="row padding-small">
        <i class="fas fa-users icon-users"></i>
        <h1>Przepisy naszych użytkowników:</h1>
        <hr>
        <div class="orange-line w-100"></div>
    </div>
</section>

<form method="post">
    <div>
        <table>
            <tr class="d-flex">
                <td class="col-5">
                    <h4>Wyszukaj przepis</h4>
                </td>
                <td>
                    <input class="w-100 p-1" name="search">
                </td>
                <td class="col-1">
                    <button type="submit" class="btn btn-color rounded-0 pt-0 pb-0 pr-4 pl-4">Szukaj</button>
                </td>
            </tr>
        </table>
    </div>
</form>
<br>
<br>

<section class="mr-4 ml-4">
    <table class="table">
        <thead>
        <tr class="d-flex text-color-darker">
            <th scope="col" class="col-5">NAZWA</th>
            <th scope="col" class="col-5">OPIS</th>
            <th scope="col" class="col-1">AKCJE</th>
        </tr>
        </thead>

        <tbody class="text-color-lighter">

        <c:forEach items="${recipies}" var="recipe">
            <tr class="d-flex">
                <td class="col-5">
                        ${recipe.getName()}
                </td>
                <td class="col-5">${recipe.getDescription()}</td>
                <td class="col-1"><a href="${pageContext.request.contextPath}/recipe/details?recipe_id=${recipe.getId()}"
                                     class="btn btn-info rounded-0 text-light">Szczegóły</a></td>
            </tr>
        </c:forEach>

        </tbody>
    </table>
</section>

</body>

<%@ include file="parts/footer.jsp"%>


