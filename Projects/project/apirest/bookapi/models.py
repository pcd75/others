from django.db import models

#Create your models here

class Book(models.Model):
    id = models.IntegerField(primary_key = True)
    name = models.CharField(max_length = 100, null=True)
    quantity = models.IntegerField(null=True)
    genre = models.CharField(max_length = 150, null=True)


#Add / Insert / Add - POST
#Retrive / fetch - GET
#Update / Edit - PUT
#Delete / DELETE - DELETE
