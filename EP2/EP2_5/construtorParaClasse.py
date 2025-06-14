class Produto:
    def __init__(self, nome: str, preco: float):
        self.__nome = nome
        self.__preco = preco
    
    def info(self):
        return f"Produto: {self.__nome}; Preço: R$ {self.__preco:.2f}"
    
nome_input = input()
preco_input = int(input())
produto = Produto(nome_input, preco_input)

print(produto.info())


        