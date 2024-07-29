from django.db import models

# Create your models here.

class Members(models.Model):
	id = models.IntegerField(primary_key = True)
	name = models.CharField(max_length=255)
	quantity = models.IntegerField()
	genre = models.CharField(max_length = 255)
