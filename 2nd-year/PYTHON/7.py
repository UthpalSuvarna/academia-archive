class percentageError(Exception):
    pass


class InvalidPecentage(percentageError):
    def __init__(self):
        super().__init__("Invalid percentage")


class lessPercentage(percentageError):
    def __init__(self):
        super().__init__("Percentage is not enough")


class check:
    def __init__(self, percentage):
        if percentage > 100:
            raise InvalidPecentage
        elif percentage < 80:
            raise lessPercentage
        else:
            print("Percentage is valid")


try:
    check(86)
except percentageError as e:
    print(e)
