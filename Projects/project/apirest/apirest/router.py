from django.db import router
from bookapi.viewset import BookViewset
from rest_framework import routers

router = routers.DefaultRouter()
router.register('book',BookViewset)


#127.0.0.1:7575/api/book/4
#GET, POST, UPDATE, DELETE
#list, retrive