from pymongo import MongoClient
from bson.objectid import ObjectId
from pprint import pprint




class AnimalShelter(object):

	def __init__(self):
		username = "aacuser"
		password = "admin"
		self.client = MongoClient(f'mongodb://{username}:{password}@localhost:37257/AAC')
		self.database = client["animal"]
		self.collection = database["animals"]

	#create a new document
	def create(data):
		if data is not None:
			location.database.location.collection.insert_one(data)
			if create.acknowledged == True:
				return
			else:
				raise Exception("1 document failed to insert")
		else:
			raise Exception("Nothing to save, because data parameter is empty")
	#find an existing document
	def read(query):
		if query is not None:
			results = location.database.location.collection.find(query)
			for x in results:
				print(x)
		else:
			raise Exception("Nothing to search, because query is empty")
	#change an existing document
	def update(newQuery, newData):
		if query is not None:
			u = location.database.location.collection.update_many(newQuery , newData)
			print(u.modified_count, " documents updated")
	#delete an existing document
	def delete(delQuery):
		if query is not None:
			d = location.database.location.collection.delete_many(delQuery)
			print(d.deleted_count, " documents deleted")
location = AnimalShelter()

















	