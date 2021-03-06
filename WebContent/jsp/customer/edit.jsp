﻿<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<TITLE>Add client</TITLE> 
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<LINK href="${pageContext.request.contextPath }/css/Style.css" type=text/css rel=stylesheet>
<LINK href="${pageContext.request.contextPath }/css/Manage.css" type=text/css
	rel=stylesheet>
	
<script type="text/javascript" src="${pageContext.request.contextPath }/js/jquery-1.11.3.min.js"></script>
<script type="text/javascript">
	$(function(){
		// load page will run the function
		$.post("${pageContext.request.contextPath }/baseDict_findByTypeCode.action",
				{"dict_type_code":"002"},function(data){
					$(data).each(function(i,n){
						$("#cust_source").append("<option value='"+n.dict_id+"'>"+n.dict_item_name+"</option>");
					});
					$("#cust_source option[value='${model.baseDictSource.dict_id}']").prop("selected","selected");
				},"json");
		$.post("${pageContext.request.contextPath }/baseDict_findByTypeCode.action",
				{"dict_type_code":"006"},function(data){
					$(data).each(function(i,n){
						$("#cust_level").append("<option value='"+n.dict_id+"'>"+n.dict_item_name+"</option>");
					});
					$("#cust_level option[value='${model.baseDictLevel.dict_id}']").prop("selected","selected");
				},"json");
		$.post("${pageContext.request.contextPath }/baseDict_findByTypeCode.action",
				{"dict_type_code":"001"},function(data){
					$(data).each(function(i,n){
						$("#cust_industry").append("<option value='"+n.dict_id+"'>"+n.dict_item_name+"</option>");
					});
					$("#cust_industry option[value='${model.baseDictIndustry.dict_id}']").prop("selected","selected");
				},"json");
	});
</script>

<META content="MSHTML 6.00.2900.3492" name=GENERATOR>
</HEAD>
<BODY>
	<s:actionerror/>
	<s:fielderror/>
	<s:form name="form1" id="form1" action="customer_update" namespace="/" method="post" enctype="multipart/form-data" theme="simple">

		<s:hidden name="cust_id" value="%{model.cust_id}"/>

		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_019.jpg"
						border=0></TD>
					<TD width="100%" background="${pageContext.request.contextPath }/images/new_020.jpg"
						height=20></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_021.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15 background=${pageContext.request.contextPath }/images/new_022.jpg><IMG
						src="${pageContext.request.contextPath }/images/new_022.jpg" border=0></TD>
					<TD vAlign=top width="100%" bgColor=#ffffff>
						<TABLE cellSpacing=0 cellPadding=5 width="100%" border=0>
							<TR>
								<TD class=manageHead>current location: client management &gt; add client</TD>
							</TR>
							<TR>
								<TD height=2></TD>
							</TR>
						</TABLE>
						
						<TABLE cellSpacing=0 cellPadding=5  border=0>
						  
						    
							<TR>
								<td>client name: </td>
								<td>
									<s:textfield cssClass="textbox" cssStyle="WIDTH: 180px" maxLength="50" name="cust_name" value="%{model.cust_name}"/>
								
								</td>
								<td>client level: </td>
								<td>
								<select id="cust_level" name="baseDictLevel.dict_id">
										<option>-Please Select-</option>
									</select>
									</td>
							</TR>
							
							<TR>
								
								<td>info source:</td>
								<td>
									<select id="cust_source" name="baseDictSource.dict_id">
										<option>-Please Select-</option>
									</select>
									</td>
								<td>industry: </td>
								<td>
								<select id="cust_industry" name="baseDictIndustry.dict_id">
										<option>-Please Select-</option>
									</select>	</td>
							</TR>
							
							<TR>
								
								
								<td>phone#：</td>
								<td>
								<s:textfield cssClass="textbox" cssStyle="WIDTH: 180px" maxLength="50" name="cust_phone" value="%{model.cust_phone}"/>
								
								</td>
								<td>alternate phone#: </td>
								<td>
								<s:textfield cssClass="textbox" cssStyle="WIDTH: 180px" maxLength="50" name="cust_mobile" value="%{model.cust_mobile}"/>
								
								</td>
							</TR>
							
							
							<tr>
								<td rowspan=2>
								<INPUT class=button id=sButton2 type=submit
														value=" save " name=sButton2>
								</td>
							</tr>
						</TABLE>
						
						
					</TD>
					<TD width=15 background="${pageContext.request.contextPath }/images/new_023.jpg">
					<IMG src="${pageContext.request.contextPath }/images/new_023.jpg" border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		<TABLE cellSpacing=0 cellPadding=0 width="98%" border=0>
			<TBODY>
				<TR>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_024.jpg"
						border=0></TD>
					<TD align=middle width="100%"
						background="${pageContext.request.contextPath }/images/new_025.jpg" height=15></TD>
					<TD width=15><IMG src="${pageContext.request.contextPath }/images/new_026.jpg"
						border=0></TD>
				</TR>
			</TBODY>
		</TABLE>
		</s:form>
</BODY>
</HTML>
