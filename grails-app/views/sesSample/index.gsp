<%--
  Created by IntelliJ IDEA.
  User: masatoshi
  Date: 11/11/22
  Time: 18:05
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" %>
<html>
  <head><title>SES サンプルページ</title></head>
  <body>
    <g:form action="send">
        <dl>
            <dt>送信元</dt>
            <dd><g:textField name="from" value="${mail?.from}" size="50" /></dd>
            <dt>送信先</dt>
            <dd><g:textField name="to" value="${mail?.to}" size="50" /></dd>
            <dt>サブジェクト</dt>
            <dd><g:textField name="subject" value="${mail?.subject}" size="50" /></dd>
            <dt>本文</dt>
            <dd><g:textArea name="body" cols="40" rows="10">${mail?.body}</g:textArea></dd>
            <dt>形式</dt>
            <dd>
                <g:radio value="text" name="subtype" /> TEXT
                /
                <g:radio value="html" name="subtype" /> HTML
            </dd>
            <dt>添付ファイル</dt>
            <dd><g:textField name="attachment" value="${mail?.attachment}" size="50" /></dd>
        </dl>
        <div><g:submitButton name="submit" value="送信" /></div>
    </g:form>
    <p>Email ID: ${mail?.id}</p>
  </body>
</html>