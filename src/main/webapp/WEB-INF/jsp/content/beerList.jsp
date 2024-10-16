<%@ taglib uri="jakarta.tags.core" prefix="c" %>

    <table class="table table-striped">
        <thead>
        <tr>
            <th>Nom</th>
            <th>Type</th>
            <th>Origine</th>
            <th>Gout</th>
        </tr>
        <tr>
            <th></th>
            <th><input type="text" id="filter-type" class="form-control filter-input" placeholder="Filtrer par type..."></th>
            <th><input type="text" id="filter-origin" class="form-control filter-input" placeholder="Filtrer par Origine..."></th>
            <th><input type="text" id="filter-flavor" class="form-control filter-input" placeholder="Filtrer par Gout..."></th>
        </tr>
        </thead>
        <tbody id="table-body">
	        <c:forEach var="beer" items="${beers}">
	            <tr>
	                <td>${beer.name}</td>
	                <td>${beer.type}</td>
	                <td>${beer.origine}</td>
	                <td>${beer.gout}</td>
	            </tr>
	        </c:forEach>
        </tbody>
    </table>
    <script src="js/beerList.js"></script>

<script>
$(document).ready(function() 
{
    $('#filter-type , #filter-origin , #filter-flavor').on('keyup', function() 
    {
    	tablefilter();
    });
});
</script>



