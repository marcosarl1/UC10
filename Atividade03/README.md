# Contexto
A empresa Cenaflix deseja ampliar seu ramo de atuação devido ao grande sucesso e agora quer expandir para streaming de áudio, com foco em podcast. Será desenvolvido para isso um módulo para gestão dos cadastros de podcast, a fim de que a equipe do Cenaflix consiga acompanhar e cadastrar as informações da plataforma. A tecnologia mais recomendada nesse caso seria JPA (Java Persistence API), por ser um framework mais seguro, que atualmente tem crescido muito no mercado, e também por ter fácil manutenção.
 
# Atividade
Sua interface de cadastro deve estar de acordo com o wireframe que se encontra no material complementar da atividade.
Desenvolva uma aplicação com três telas:

   * A primeira tela será um login contendo usuário e senha. Ao se conectar, o usuário receberá uma mensagem em um JOptionPane semelhante a essa:

     “Olá USUÁRIO, sua permissão é de TIPO_DE_USUÁRIO. Seja bem-vindo!”.
     
     Você terá que criar pelo menos três tipos de usuários diferentes, por exemplo: Administrador, Operador e Usuário. Cada usuário terá permissões diferentes, tais como:

   * Administrador: cadastrar, excluir e listar
   * Operador: cadastrar e listar
   * Usuário: listar

Dica: utilize a propriedade .setEnabled( ) para desabilitar, segundo a permissão de acesso de cada usuário, a visibilidade do botão ou menu que leva às telas desenvolvidas. Defina essa propriedade junto à mensagem que o usuário recebe ao se conectar.

   * A segunda tela será um cadastro do repositório de podcast, contendo os campos: ID, produtor, nome do episódio, nº do episódio, duração e URL do repositório.
   * A terceira tela será uma listagem de todos os dados cadastrados.

     * Realize a criação de um filtro por produtor.

# Entrega
No espaço dedicado à entrega da atividade, envie um arquivo compactado (ZIP, RAR ou 7z) contendo todo o projeto NetBeans criado para a atividade, o script SQL, a documentação do projeto gerado pelo NetBeans (Javadoc) e também o arquivo executável do projeto (.jar).
