public class Chocolate {
    
    String type, flavor, brand, color, shape, packaging, ingredients, origin, size, texture, 
           cocoaPercentage, sweetnessLevel, servingSize, storageInstructions, priceCategory, 
           certifications, allergyInformation, recommendedUse, packagingMaterial, productionMethod, 
           shelfLife;
    int weight, calories, sugarContent, fatContent, proteinContent, numberOfPieces, expirationDate, 
        price, quantityInStock, manufacturingYear;

    
    public Chocolate(String type, String flavor, String brand, String color, String shape, 
                     String packaging, String ingredients, String origin, String size, String texture, 
                     String cocoaPercentage, String sweetnessLevel, String servingSize, 
                     String storageInstructions, String priceCategory, String certifications, 
                     String allergyInformation, String recommendedUse, String packagingMaterial, 
                     String productionMethod, String shelfLife, int weight, int calories, 
                     int sugarContent, int fatContent, int proteinContent, int numberOfPieces, 
                     int expirationDate, int price, int quantityInStock, int manufacturingYear) {
        this.type = type;
        this.flavor = flavor;
        this.brand = brand;
        this.color = color;
        this.shape = shape;
        this.packaging = packaging;
        this.ingredients = ingredients;
        this.origin = origin;
        this.size = size;
        this.texture = texture;
        this.cocoaPercentage = cocoaPercentage;
        this.sweetnessLevel = sweetnessLevel;
        this.servingSize = servingSize;
        this.storageInstructions = storageInstructions;
        this.priceCategory = priceCategory;
        this.certifications = certifications;
        this.allergyInformation = allergyInformation;
        this.recommendedUse = recommendedUse;
        this.packagingMaterial = packagingMaterial;
        this.productionMethod = productionMethod;
        this.shelfLife = shelfLife;
        this.weight = weight;
        this.calories = calories;
        this.sugarContent = sugarContent;
        this.fatContent = fatContent;
        this.proteinContent = proteinContent;
        this.numberOfPieces = numberOfPieces;
        this.expirationDate = expirationDate;
        this.price = price;
        this.quantityInStock = quantityInStock;
        this.manufacturingYear = manufacturingYear;
    }

    
    public void printDetails() {
        System.out.println("Chocolate Details:");
        System.out.println("Type: " + type);
        System.out.println("Flavor: " + flavor);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Shape: " + shape);
        System.out.println("Packaging: " + packaging);
        System.out.println("Ingredients: " + ingredients);
        System.out.println("Origin: " + origin);
        System.out.println("Size: " + size);
        System.out.println("Texture: " + texture);
        System.out.println("Cocoa Percentage: " + cocoaPercentage);
        System.out.println("Sweetness Level: " + sweetnessLevel);
        System.out.println("Serving Size: " + servingSize);
        System.out.println("Storage Instructions: " + storageInstructions);
        System.out.println("Price Category: " + priceCategory);
        System.out.println("Certifications: " + certifications);
        System.out.println("Allergy Information: " + allergyInformation);
        System.out.println("Recommended Use: " + recommendedUse);
        System.out.println("Packaging Material: " + packagingMaterial);
        System.out.println("Production Method: " + productionMethod);
        System.out.println("Shelf Life: " + shelfLife);
        System.out.println("Weight: " + weight);
        System.out.println("Calories: " + calories);
        System.out.println("Sugar Content: " + sugarContent);
        System.out.println("Fat Content: " + fatContent);
        System.out.println("Protein Content: " + proteinContent);
        System.out.println("Number of Pieces: " + numberOfPieces);
        System.out.println("Expiration Date: " + expirationDate);
        System.out.println("Price: " + price);
        System.out.println("Quantity in Stock: " + quantityInStock);
        System.out.println("Manufacturing Year: " + manufacturingYear);
    }
}
