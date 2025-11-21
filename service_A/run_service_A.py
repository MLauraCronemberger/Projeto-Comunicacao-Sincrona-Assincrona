# run_servidor_a.py
# Inicia o Servidor gRPC para o Serviço A (Metadados Básicos)

import grpc
from concurrent import futures
import time 

# IMPORTAÇÃO CORRETA: Busca a classe CatalogoLivrosService do arquivo catalogo_service.py
from catalogo_service import CatalogoLivrosService

# Importa os stubs gRPC gerados
import catalogo_pb2_grpc

# Define a porta de escuta
PORTA = '[::]:5000' 

def serve():
    # Cria o pool de threads para lidar com as requisições
    server = grpc.server(futures.ThreadPoolExecutor(max_workers=5))
    
    # Anexa o serviço implementado (sua lógica) ao servidor gRPC.
    # A função add_InfosLivroService_to_server é gerada pelo Protobuf
    # com base no nome do seu serviço no .proto (InfosLivroService).
    catalogo_pb2_grpc.add_InfosLivroServiceServicer_to_server(
        CatalogoLivrosService(), server)
    
    # Adiciona a porta (insegura, para ambiente de desenvolvimento)
    server.add_insecure_port(PORTA)
    
    # Inicia o servidor
    server.start()
    
    print(f"Servidor A rodando na porta {PORTA}...")
    
    # MODO PADRÃO PARA MANTER O SERVIDOR ATIVO
    server.wait_for_termination()

if __name__ == '__main__':
    serve()