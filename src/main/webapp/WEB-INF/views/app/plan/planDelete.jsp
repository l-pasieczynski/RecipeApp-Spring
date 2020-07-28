<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@include file="../appParts/header.jsp"%>

<section class="dashboard-section">
    <div class="row dashboard-nowrap">
        <%@include file="../appParts/menu.jsp" %>

        <div class="m-4 p-3 width-medium text-color-darker">
            <div class="dashboard-content border-dashed p-3 m-4 view-height">
                <div class="mt-4 ml-4 mr-4">
                    <form:form method="POST" modelAttribute="decision">
                        <div class="row border-bottom border-3">
                            <div class="col"><h3 class="color-header text-uppercase">Czy na pewno chcesz usunąć plan?</h3></div>
                        </div>

                        <table class="table borderless">
                            <tbody>
                            <tr class="d-flex">
                                <td>
                                    <div class="col d-flex justify-content-end mb-2"><input value="OK" type="submit" name="decision" class="btn btn-color rounded-0 pt-0 pb-0 pr-4 pl-4"></div>
                                </td>
                            </tr>
                            <tr class="d-flex">
                                <td>
                                    <div class="col d-flex justify-content-end mb-2"><input value="Anuluj" type="submit" name="decision" class="btn btn-color rounded-0 pt-0 pb-0 pr-4 pl-4"></div>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </form:form>
                </div>
            </div>
        </div>
    </div>
</section>



<%@include file="../appParts/footer.jsp"%>