# Generated by Django 4.0.6 on 2022-07-16 13:48

from django.db import migrations, models


class Migration(migrations.Migration):

    dependencies = [
        ('tutorials', '0003_alter_tutorial_rating'),
    ]

    operations = [
        migrations.AddField(
            model_name='tutorial',
            name='ayz',
            field=models.CharField(default='', max_length=10),
        ),
    ]
