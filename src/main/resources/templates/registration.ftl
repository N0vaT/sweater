<#import "parts/common.ftl" as c>
<#import "parts/login.ftl" as l>

<@c.page>
Add new user
${message !" "}
<@l.login "/registration" />
<a href="/login">Login page</a>
</@c.page>