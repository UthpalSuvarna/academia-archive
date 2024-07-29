class Time:
    def __init__(self,hours=0,minutes=0,seconds=0):
        self.hours = hours
        self.minutes = minutes
        self.seconds = seconds
        self.minutes += self.seconds // 60
        self.seconds = self.seconds % 60
        self.hours += self.minutes // 60
        self.minutes = self.minutes % 60
        self.hours = self.hours % 24
    def __str__ (self):
        return f"{self.hours:02}:{self.minutes:02}:{self.seconds:02}"
    
    def __add__(self,other):
        new_hours = self.hours + other.hours
        new_minutes = self.minutes + other.minutes
        new_seconds = self.seconds + other.seconds
        return Time(new_hours, new_minutes, new_seconds)
time1 = Time(10, 45, 30)
time2 = Time(2, 20, 50)
time3 = time1 + time2
print("Time 1:", time1)
print("Time 2:", time2)
print("Time 3:", time3)