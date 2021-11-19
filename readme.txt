Enoncé

Une compagnie de voyage souhaite gérer les billets et primes de ses voyageurs au moyen d’un programme Java.

Un voyageur est caractérisé par son nom, son prénom, son âge et la date de son voyage.

Dans un fichier Salaires.java, codez une classe abstraite Voyageur dotée des attributs nécessaires, d’une méthode abstraite
calculerBillet (ce calcul dépendra en effet du type de voyageur) et d’une méthode getNom retournant une chaine de caractère
obtenue en concaténant la chaine de caractères « Le voyageur  » avec le prénom et le nom.

Dotez également votre classe d’un constructeur prenant en paramètre l’ensemble des attributs nécessaires.

Calcul du billet

Le calcul du billet dépend du type de voyageur. On distingue les types de voyageur suivants :
1-Ceux qui sont des Ministre. Pour leur billet ils ont 50 % de réduction sur le gain de chaque vol.
2-Ceux qui sont des hommes d'affaires. Pour leur billet ils ont 50 % de réduction sur le gain de chaque vol.
3-Ceux affectés à la Production. Leur billet vaut le nombre de machine réparer multipliées par 5.
4-Ceux qui sont des pilote. Leur billet vaut leur nombre d’heures de travail mensuel multipliées par 65 francs.

Codez dans votre fichier Salaires.java une hiérarchie de classes pour les voyageurs en respectant les conditions suivantes :

1-La super-classe de la hiérarchie doit être la classe Voyageur.
2-Les nouvelles classes doivent contenir les attributs qui leur sont spécifiques ainsi que le codage approprié des méthodes 
	calculerBillet et getNom, en changeant le mot « voyageur » par la catégorie correspondante.
3-Chaque sous classe est dotée de constructeur prenant en argument l’ensemble des attributs nécessaires.

Voyageur à risques
Certains voyageurs des secteurs production et pilotage ont à leur charge de s'assurer que les machines sont en bon état pour le voyage. Aussi ims ont interet è ce que le voyage se passe bien.

Après plusieurs négociations syndicales, ces derniers parviennent à obtenir un bonus de risque.

Complétez votre programme Salaires.java en introduisant deux nouvelles sous-classes de voyageur. Ces sous-classes désigneront
les voyageurs des secteurs production et pilotage ayant la vie des autres voyageur entre leur mains.

Ajouter également à votre programme une interface pour les voyageurs à risque permettant de leur associer un bonus
fixe de 700.

La compagnie souhaite maintenant l’exploiter les données pour afficher le billet de tous ses voyageurs
ainsi que le gain moyen.

Ajoutez une classe Individu contenant des voyageurs.

Définissez ensuite les méthodes suivantes à la classe Individu :

1-void ajouterVoyageur(Employe)qui ajoute un voyageur.
2-void affichage()qui affiche le billet de chacun des voyageur.
3-double gainMoyen()qui affiche le gain moyen des voyageurs.




