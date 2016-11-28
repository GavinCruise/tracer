import scrapy
import json
import sys


class LuooSprider(scrapy.Spider):
	name = "luoo"
	allowed_domain = ["www.luoo.net"]
	start_urls = [
	"http://www.luoo.net/music/874"
	]

	def parse(self,response):
		reload(sys)  
		sys.setdefaultencoding('utf8')
		title = response.xpath('/html/head/title').extract()
		desc = response.css('.vol-desc').extract()
		date = response.css('.vol-date').extract()
		print json.dumps(title),desc,date
		pass