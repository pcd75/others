from django.db import models

# Create your models here.
class Tutorial(models.Model):
    id = models.IntegerField(primary_key = True)
    book_name = models.CharField(max_length=100, blank=False, default='')
    quantity = models.IntegerField()
    book_genre = models.CharField(max_length = 150, blank=False, default='')
    is_best_seller = models.BooleanField(default=False)
    created_at = models.DateField()
    updated_at = models.DateField()
    rating = models.DecimalField(blank=False, null=True, max_digits=2, decimal_places=1)


    