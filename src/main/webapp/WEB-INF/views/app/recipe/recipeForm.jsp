<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="../appParts/header.jsp"%>

<section class="dashboard-section">
    <div class="row dashboard-nowrap">
        <%@include file="../appParts/menu.jsp" %>


        <div class="m-4 p-3 width-medium text-color-darker">
            <div class="dashboard-content border-dashed p-3 m-4 view-height">
                <form:form method="post" modelAttribute="recipe">
                    <div class="mt-4 ml-4 mr-4">
                        <div class="row border-bottom border-3">
                            <div class="col"><h3 class="color-header text-uppercase">Nowy przepis</h3></div>
                            <div class="col d-flex justify-content-end mb-2">
                                <form:button type="submit" class="btn btn-color rounded-0 pt-0 pb-0 pr-4 pl-4">Zapisz
                                </form:button>
                            </div>
                        </div>

                        <table class="table borderless">
                            <tbody>
                            <tr class="d-flex">
                                <th scope="row" class="col-2">Nazwa Przepisu</th>
                                <td class="col-7">

                                    <form:input name="name" id="name" path="name" class="w-100 p-1" value=""/>
                                </td>
                            </tr>
                            <tr class="d-flex">
                                <th scope="row" class="col-2">Opis przepisu</th>
                                <td class="col-7"><form:textarea class="w-100 p-1" name="description" path="description" rows="5"/>
                                </td>
                            </tr>
                            <tr class="d-flex">
                                <th scope="row" class="col-2">Przygotowanie (minuty)</th>
                                <td class="col-3">
                                    <form:input class="p-1" type="number" name="time" path="preparationTime" value=""/>
                                </td>
                            </tr>
                            </tbody>
                        </table>

                        <div class="row d-flex">
                            <div class="col-5 border-bottom border-3"><h3 class="text-uppercase">Sposób
                                przygotowania</h3></div>
                            <div class="col-2"></div>
                            <div class="col-5 border-bottom border-3"><h3 class="text-uppercase">Składniki</h3></div>
                        </div>
                        <div class="row d-flex">
                            <div class="col-5 p-4">
                                <form:textarea class="w-100 p-1" name="descHow" rows="10" path="preparation"/>
                            </div>
                            <div class="col-2"></div>

                            <div class="col-5 p-4">
                                <form:textarea class="w-100 p-1" name="ingredients" rows="10" path="ingredients"/>
                            </div>
                        </div>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</section>

<%@include file="../appParts/footer.jsp"%>