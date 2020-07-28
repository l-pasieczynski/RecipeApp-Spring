<%--
  Created by IntelliJ IDEA.
  User: kris
  Date: 28.07.2020
  Time: 19:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@include file="../appParts/header.jsp"%>
<section class="dashboard-section">
    <div class="row dashboard-nowrap">
        <%@include file="../appParts/menu.jsp" %>

        <div class="m-4 p-3 width-medium text-color-darker">
            <div class="m-4 border-dashed view-height">
                <!-- fix action, method -->
                <!-- add name attribute for all inputs -->
                <form:form method="post" modelAttribute="user">
                    <div class="mt-4 ml-4 mr-4">
                        <div class="row border-bottom border-3">
                            <div class="col"><h3 class="color-header text-uppercase">Edytuj dane</h3></div>
                            <div class="col d-flex justify-content-end mb-2">
                                <button type="submit" class="btn btn-color rounded-4 pt-0 pb-0 pr-4 pl-4">Zapisz
                                </button>
                            </div>
                        </div>
                        <table class="table borderless">
                            <tbody>
                            <tr class="d-flex">
                                <th scope="row" class="col-2"><h4>Imię</h4></th>
                                <td class="col-7">
                                    <form:input class="w-100 p-1" type="text" path="username" />
                                </td>
                            </tr>
                            <tr class="d-flex">
                                <th scope="row" class="col-2"><h4>Email</h4></th>
                                <td class="col-3">
                                    <form:input class="w-100 p-1" type="text" path="email" />
                                    <form:input path="password" type="hidden"/>
                                    <form:input path="id" type="hidden"/>
                                </td>
                            </tr>
                            </tbody>
                        </table>
                    </div>
                </form:form>
            </div>
        </div>
    </div>
</section>
