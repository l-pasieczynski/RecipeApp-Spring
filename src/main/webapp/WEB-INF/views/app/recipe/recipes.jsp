<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="../appParts/header.jsp"%>

<section class="dashboard-section">
    <div class="row dashboard-nowrap">
        <%@include file="../appParts/menu.jsp" %>


        <div class="m-4 p-3 width-medium">
            <div class="dashboard-content border-dashed p-3 m-4 view-height">
                <div class="row border-bottom border-3 p-1 m-1">
                    <div class="col noPadding"><h3 class="color-header text-uppercase">Lista Przepisów</h3></div>
                    <div class="col noPadding d-flex justify-content-end mb-2">
                        <a href="${pageContext.request.contextPath}/app"
                           class="btn btn-success rounded-4 pt-0 pb-0 pr-4 pl-4">Powrót do strony głównej</a>
                    </div>
                    <div class="col noPadding d-flex justify-content-end mb-2">
                        <a href="${pageContext.request.contextPath}/app/recipe/add"
                           class="btn btn-success rounded-4 pt-0 pb-0 pr-4 pl-4">Dodaj nowy przepis</a>
                    </div>
                </div>
                <table class="table border-bottom schedules-content">
                    <thead>
                    <tr class="d-flex text-color-darker">
                        <th scope="col" class="col-1">ID</th>
                        <th scope="col" class="col-2">NAZWA</th>
                        <th scope="col" class="col-7">OPIS</th>
                        <th scope="col" class="col-2 center">AKCJE</th>
                    </tr>
                    </thead>
                    <tbody class="text-color-lighter">
                    <c:forEach var="allRecipe" items="${recipes}">
                        <tr class="d-flex">
                            <th scope="row" class="col-1">
                                    ${allRecipe.id}
                            </th>
                            <td class="col-2">
                                    ${allRecipe.name}
                            </td>
                            <td class="col-7">
                                    ${allRecipe.description}
                            </td>
                            <td class="col-2 d-flex align-items-center justify-content-center flex-wrap">
                                <a href="${pageContext.request.contextPath}/app/recipe/delete?id=${allRecipe.id}"
                                   class="btn btn-danger rounded-4 text-light m-1">Usuń</a>
                                <a href="${pageContext.request.contextPath}/app/recipe/details?id=${allRecipe.id}"
                                   class="btn btn-info rounded-4 text-light m-1">Szczegóły</a>
                                <a href="${pageContext.request.contextPath}/app/edit/recipe?id=${allRecipe.id}"
                                   class="btn btn-warning rounded-4 text-light m-1">Edytuj</a>
                            </td>
                        </tr>
                    </c:forEach>
                    </tbody>
                </table>
            </div>
        </div>
    </div>
</section>

<%@include file="../appParts/footer.jsp"%>

