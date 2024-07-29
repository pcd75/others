from django.http import HttpResponse, HttpResponseRedirect
from django.template import loader
from django.urls import reverse
from .models import Members

def index(request):
  mymembers = Members.objects.all().values()
  template = loader.get_template('index.html')
  context = {
    'mymembers': mymembers,
  }
  return HttpResponse(template.render(context, request))

def add(request):
  template = loader.get_template('add.html')
  return HttpResponse(template.render({}, request))

def addrecord(request):
  a = request.POST['id']
  b = request.POST['name']
  c = request.POST['quantity']
  d = request.POST['genre']
  member = Members(id=a, name=b, quantity=c, genre=d)
  member.save()
  return HttpResponseRedirect(reverse('index'))

def delete(request, id):
  member = Members.objects.get(id=id)
  member.delete()
  return HttpResponseRedirect(reverse('index'))

def update(request, id):
  mymember = Members.objects.get(id=id)
  template = loader.get_template('update.html')
  context = {
    'mymember': mymember,
  }
  return HttpResponse(template.render(context, request))

def updaterecord(request, id):
  name = request.POST['name']
  quantity = request.POST['quantity']
  genre = request.POST['genre']
  member = Members.objects.get(id=id)
  member.name = name
  member.quantity = quantity
  member.genre = genre
  member.save()
  return HttpResponseRedirect(reverse('index'))


def testing(request):
  mymember = Members.objects.filter(id=1).values()
  template = loader.get_template('get.html')
  context = {
    'mymembers': mymember,
  }
  return HttpResponse(template.render(context, request))

