package org.products

class ProductsController {

static scaffold = Products

    def index() {
   
		//render(view: "index") // Custom view - Don't enable this index
		//render(view: "products")

		// Get all products
		def productList = Products.list()

		//Query the data from the database
		[productList:productList]
		
    
}


}