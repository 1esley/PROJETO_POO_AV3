Sistema de Gerenciamento Interno da Catolica E-Sports

Este é um sistema de gerenciamento para a Catolica E-Sports, que permite controlar jogadores, equipes, lineups e campeonatos. A aplicação oferece menus interativos para o gerenciamento de jogadores, criação de lineups, participação em campeonatos e interações nas redes sociais.

Funcionalidades
1. Menu Principal
Coach: 
- O treinador pode:
    Montar lineups.
    Treinar lineups (não implementado ainda).
    Trazer jogadores para o time.

Social Media: 
- O responsável pelas redes sociais pode:
    Criar posts relacionados aos campeonatos.

Campeonatos: 
    A gestão dos campeonatos onde a equipe participa.
Ver campeonatos cadastrados.

Sair: Encerra o programa.

2. Gerenciamento de Lineups
O treinador pode montar lineups para diferentes jogos, como CS2, Valorant e LOL.
Cada lineup pode ter no máximo 5 jogadores.

3. Campeonatos
O sistema permite registrar campeonatos como Mundial e associá-los a modalidades como FPS.

4. Jogadores
Jogadores são contratados pelo treinador e atribuídos a uma função dentro do time, como Atacante, Suporte, etc.
Estrutura do Projeto
O projeto é dividido em diferentes pacotes, cada um responsável por uma parte do sistema:

br.com.catolica.gerenciamento.Modules: Contém os módulos principais do sistema.
Games: Gestão de campeonatos e partidas.
Team: Gestão dos jogadores, time e treinador.
Principais Classes
Main: A classe principal que executa o menu interativo do sistema.
Campeonato: Classe abstrata representando um campeonato.
Mundial: Representação do campeonato MAJOR.
Time: Representa o time da Catolica Esports, incluindo jogadores.
Player: Representação dos jogadores no time.
CoachController: Controlador que gerencia as ações do treinador.
SocialMedia: Representação do responsável pelas redes sociais do time.

Desenvolvido por: Wesley