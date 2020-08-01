class WasRun:
    def __init__(self, name):
        self.wasRun = None
        self.name = name

    def run(self):
        method = getattr(self, self.name)
        method()