function tablefilter()
{
    const typeValue= $('#filter-type').val().toLowerCase();
    const originValue= $('#filter-origin').val().toLowerCase();
    const flavorValue= $('#filter-flavor').val().toLowerCase();
    
    $('#table-body tr').filter(function() 
    {
        $(this).toggle(
                ($(this).find('td:eq(1)').text().toLowerCase().indexOf(typeValue) > -1 || typeValue === "") &&
                ($(this).find('td:eq(2)').text().toLowerCase().indexOf(originValue) > -1 || originValue === "") &&
                ($(this).find('td:eq(3)').text().toLowerCase().indexOf(flavorValue) > -1 || flavorValue === "")
        );
    });
}