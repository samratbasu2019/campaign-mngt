# Getting Started

Template User Specification 

http://localhost:8300/core/template/addUserTemplate 
{
                "userid" :"4",
                "templateData" : "<html><body></html>",
                "date" : "12-12-2019",
                "contactAlias" : "ram",
                "contactEmails" : "tamal1@infosys.com"
}

http://localhost:8300/core/template/updateUserTemplate?templateId=28 
{
                "userid" :"2",
                "templateData" : "<html><body/></html>",
                "date" : "12-12-2019",
                "contactAlias" : "Shyam",
                "contactEmails" : "samrat.basu@infosys.com"
}

http://localhost:8300/core/template/findAll 
http://localhost:8300/core/template/getUserTemplate?templateId=29 
http://localhost:8300/core//template/getTemplatebyUserId?userid=2 

Contact Specification

http://localhost:8300/core/contacts/addContact 
{
"userId" : "3",
"contactEmails" : "dipa.basu@gmail.com",
"aliasGroup" : "rahuil"
}

http://localhost:8300/core/contacts/updateContact?userid=2 
{
"contactEmails" : "samtina.basu@gmail.com",
"aliasGroup" : "sam"
}

http://localhost:8300/core/contacts/getContact?userid=2 

http://localhost:8300/core/contacts/findAll 


