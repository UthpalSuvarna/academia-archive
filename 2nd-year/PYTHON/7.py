class PercentageError(Exception):
    pass

class invalidPercentageError(PercentageError):
    def __init__ (self):
        super().__inti__("Invalid percentage value")

class lessPercentageError(PercentageError):
    def __inti__(self):
        super().__inti__("Percentage value is less than cutoff")

class checkPercentage(PercentageError):
    def __init__ (self,per):
        if per<80:
            raise lessPercentageError
        if per>100:
            raise invalidPercentageError
        print("Percentage value is valid")

try:
    checkPercentage(96)
except PercentageError as e:
    print(e)