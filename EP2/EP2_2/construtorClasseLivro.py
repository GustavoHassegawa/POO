class Livro:
    def __init__(self, titulo: str, autor: str):
        self.titulo = titulo
        self.autor = autor
    
    def getInfo(self):
        return f"Livro: {self.titulo}, Autor: {self.autor}"
    
titulo_input = input()
autor_input = input()
livro = Livro(titulo_input, autor_input)
print(livro.getInfo())

