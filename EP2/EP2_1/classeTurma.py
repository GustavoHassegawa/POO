class Turma:
    def __init__(self, codigo: str, sala: str):
        self.codigo = codigo
        self.sala = sala
    
    def getInformacoes(self):
        return f"Código da turma: {self.codigo}; Sala/Lab.: {self.sala}"

codigo_input = input()
sala_input = input()
turma = Turma(codigo_input, sala_input)
print(turma.getInformacoes())