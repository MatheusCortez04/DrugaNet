#### Bean: 
é uma instancia de um objeto criada e gerenciada pelo Spring,
não utiiliza o new eo spring constroi durante a inicializacao.
Após a criação o bean fica armazenado dentro do "ApplicationContext" 
Alguns tipos de beans são: 
- @Component
- @Service
- @Controller
#### Bean LifeCycle :

1 - O Spring constroi o bean e injeta os demais beans que são dependencias.

@PostConstruct - É executado após a finalizacao da construcao e configuracao dos beans

@PréDestroy: é executado antes da destruicao do contexto


#### Injeção de dependencia:

- Construtor: recomendado por expor visualmente o numero de dependencias 

- Por Setter(Autowired): Dependencia opcional, permite a substituição apos a criacao
- Por field menos verboso, não possibilita final e não testavel omite a quantidade de dependencias reais