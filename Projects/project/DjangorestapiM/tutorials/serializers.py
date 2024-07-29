from rest_framework import serializers 
from tutorials.models import Tutorial
 
 
class TutorialSerializer(serializers.ModelSerializer):
 
    class Meta:
        model = Tutorial
        fields = ( 'id', 'book_name', 'quantity', 
        'book_genre', 'is_best_seller',
        'created_at', 'updated_at',
        'rating'
        )