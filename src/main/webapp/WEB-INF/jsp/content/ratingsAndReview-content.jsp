<%@page import="java.net.URL"%>
<%@ taglib uri="jakarta.tags.core" prefix="c" %>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nom</th>
            <th>Type</th>
            <th>Note et Avis</th>
        </tr>
        </thead>
        <tbody id="table-body">
            <c:forEach var="beer" items="${beers}">
                <tr>
                    <td><c:out value="${beer.name}"/></td>
                    <td><c:out value="${beer.type}"/></td>
                    <td>
                        <form class="beerComment" /*action="/submitRating" method="post" */>
	                        <input type="hidden" name="beerName" value="${beer.name}">
	                        <textarea name="comment" rows="4" cols="60" placeholder="Votre commentaire..." required></textarea>
	                        <button type="submit" class="btn btn-primary btn-sm">Envoyer</button>
                        </form>
                    </td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    
    <h1>Anciens Commentaires</h1>
    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nom</th>
            <th>Type</th>
            <th>Note et Avis</th>
        </tr>
        </thead>
        <tbody id="table-body">
            <c:forEach var="ratingsAndReviewBeer" items="${ratingsAndReviewBeers}">
                <tr>
                    <td><c:out value="${ratingsAndReviewBeer.beerName}"/></td>
                    <td><c:out value="${ratingsAndReviewBeer.beerType}"/></td>
                    <td><c:out value="${ratingsAndReviewBeer.beerComment}"/></td>
                </tr>
            </c:forEach>
        </tbody>
    </table>
    

<script>
        $(document).ready(function() {
            $('.beerComment').submit(function(e) 
            		{
                e.preventDefault();
                var form = $(this);
                $.ajax({
                    url: '/submitRating',
                    type: 'POST',
                    data: form.serialize(),
                    success: function(response) {
                        alert(response);
                        window.location.reload();
                    },
                    error: function() {
                        alert('Une erreur est survenue');
                    }
                });
            });
        });
    </script>




