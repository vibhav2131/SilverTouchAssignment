<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<div class=container>
<h5>Employee List</h5>
<table class="table">  
    <thead>  
      <tr>  
        <th scope="col">Sr.No</th>  
        <th scope="col">Name</th>  
        <th scope="col">BirtDate</th>  
        <th scope="col">Joining Date</th>  
        <th scope="col">Salary</th> 
        <th scope="col">Is Fresher Employee</th> 
        <th scope="col" style="align-content: center">Edit</th>  
      </tr>  
    </thead>  
    <tbody>  
      <tr>  
        <td scope="col"></td>  
        <td scope="col"></td>  
        <td scope="col"></td>  
        <td scope="col"></td>  
        <td scope="col"></td>  
        <td scope="col"></td>  
        <td style="display:none"></td>  
        <td scope="col">  
          <button type="button" class="btn btn-default btn-primary" )"  
            data-toggle="modal" data-target>  
            <span class="glyphicon glyphicon-edit"></span> Edit  
          </button>  
          |  
          <button type="button" class="btn btn-default btn-danger">  
            <span class="glyphicon glyphicon-trash"></span> Delete  
          </button>  
  
        </td>  
      </tr>  
    </tbody>  
  </table>  
  </div> 

</body>
</html>