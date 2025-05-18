from datetime import datetime

# Interface Discountable
class Discountable:
    def get_discounted_price(self, discount_percentage: float) -> float:
        raise NotImplementedError


# Abstract Product class
class Product:
    def _init_(self):
        self.created_at = datetime.now()

    def get_created_at(self):
        return self.created_at

    def get_category(self) -> str:
        raise NotImplementedError

    def get_info(self) -> str:
        raise NotImplementedError


# Electronics class with inner Specification class
class Electronics(Product, Discountable):
    class Specification:
        def _init_(self, weight: float, brand: str):
            self.weight = weight
            self.brand = brand

        def get_specs(self):
            return f"Brand: {self.brand}, Weight: {self.weight}kg"

    def _init_(self, name: str, price: float, weight: float, brand: str):
        super()._init_()
        self.name = name
        self.price = price
        self.spec = self.Specification(weight, brand)

    def get_category(self) -> str:
        return "Electronics"

    def get_info(self) -> str:
        return f"Name: {self.name}, Specs: {self.spec.get_specs()}, Price: {self.price}"

    def get_discounted_price(self, discount_percentage: float) -> float:
        return self.price * (1 - discount_percentage / 100)
