<%@ page contentType="text/html; charset=GBK"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<html><style type="text/css">
<!--
body {
	background-color: #869de3;
}
-->
a { font-size: 12pt; text-decoration: none}
</style>
	<body>
		<center>
			
			<s:form action="" theme="simple">
				<s:property value="%{getText('votetitle')}" />��
				<s:property value="#session.vote.title" />
				<br>
				<s:radio list="#session.map" />
				<br>
				<s:submit value="��һ��" />
			</s:form>
		</center>
	</body>
</html>
